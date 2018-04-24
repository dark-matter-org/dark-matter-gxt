package org.dmd.mvw.extensions;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.generated.dmw.ClassDefinitionIterableDMW;
import org.dmd.mvw.tools.mvwgenerator.extended.PropertyAccess;
import org.dmd.mvw.tools.mvwgenerator.interfaces.MvwPropertyAccessGeneratorIF;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.exceptions.DebugInfo;

public class GxtPropertyAccessFormatter implements MvwPropertyAccessGeneratorIF {
	
	// We don't provide access to the schema in which the object
	// was defined because it isn't resolved as part of object resolution
	private final static String SCHEMAREF = "SchemaDefinitionREF";

	@Override
	public void formatPropertyAccess(String outdir, PropertyAccess access) throws IOException {

		ClassDefinitionIterableDMW it = access.getAccessForIterable();
		while(it.hasNext()) {
			ClassDefinition cd = it.next();
			formatForClass(outdir, access, cd);
		}
	}

	private void formatForClass(String outdir, PropertyAccess access, ClassDefinition cd) throws IOException {
		String 	name 	= Manipulator.capFirstChar(cd.getName() + "Properties");
        BufferedWriter 	out 	= FileUpdateManager.instance().getWriter(outdir, name + ".java");
		String genPackage = access.getDefinedInModule().getGenPackage();
		
		ImportManager imports = new ImportManager();
		imports.addImport("com.google.gwt.editor.client.Editor.Path","Required for key access");
		imports.addImport("com.sencha.gxt.data.shared.PropertyAccess","The generic class we extend");
		imports.addImport("com.sencha.gxt.data.shared.ModelKeyProvider","Provides a key for the object");
		imports.addImport("com.sencha.gxt.core.client.ValueProvider","Provides property level access");
		imports.addImport(cd.getDmoImport(),"The DMO we're providing access for");
		
		TreeMap<DefinitionName, AttributeDefinition> may = cd.getAllMay();
		TreeMap<DefinitionName, AttributeDefinition> must = cd.getAllMust();
		
		for(AttributeDefinition ad: may.values()) {
			if (ad.getType().getHelperClassName() != null) {
				if (!ad.getType().getHelperClassName().endsWith(SCHEMAREF))
					imports.addImport(ad.getType().getHelperClassName(), "Reference attribute import for attribute: " + ad.getName());
			}
			else if (ad.getType().getPrimitiveType() != null) {
				imports.addImport(ad.getType().getPrimitiveType(),"Primitive attribute type import for attribute: " + ad.getName());
				addMultiValueImport(imports, ad);				
			}
		}
		for(AttributeDefinition ad: must.values()) {
			if (ad.getType().getHelperClassName() != null) {
				if (!ad.getType().getHelperClassName().endsWith(SCHEMAREF))
					imports.addImport(ad.getType().getHelperClassName(), "Reference attribute import for attribute: " + ad.getName());
			}
			else if (ad.getType().getPrimitiveType() != null) {
				imports.addImport(ad.getType().getPrimitiveType(),"Primitive attribute type import for attribute: " + ad.getName());
				addMultiValueImport(imports, ad);				
			}
		}
		
		String dmoName = cd.getName() + "DMO";
		
        out.write("package " + genPackage + ".generated.mvw.properties;\n\n");
        
        out.write(imports.getFormattedImports() + "\n");
        
        out.write("// " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public interface " + name + " extends PropertyAccess<" + dmoName + "> {\n\n");
        
        out.write("    @Path(\"" + cd.getIsNamedBy().getName() + "\")\n");
        out.write("    ModelKeyProvider<" + dmoName + "> key();\n\n");
        
		for(AttributeDefinition ad: may.values()) {
			writeAttributeAccessor(out, dmoName, ad);
		}
		for(AttributeDefinition ad: must.values()) {
			writeAttributeAccessor(out, dmoName, ad);
		}

        out.write("}\n\n");
        
        out.close();
	}
	
	private void addMultiValueImport(ImportManager imports, AttributeDefinition ad) {
		switch(ad.getValueType()) {
		case SINGLE:
			break;
		case MULTI:
		case HASHSET:
		case TREESET:
			imports.addImport("java.util.Iterator","Required for multi-valued access");
			break;
		case HASHMAPPED:
			break;
		case TREEMAPPED:
			break;
		}
	}
	
	private void writeAttributeAccessor(BufferedWriter out, String dmoName, AttributeDefinition ad) throws IOException {
		if (ad.getType().getHelperClassName() != null) {
			if (ad.getType().getHelperClassName().endsWith(SCHEMAREF))
				return;
		}
		
		switch(ad.getValueType()) {
		case SINGLE:
			formatSV(out, dmoName, ad);
			break;
		case MULTI:
		case HASHSET:
		case TREESET:
			formatMV(out, dmoName, ad);
			break;
		case HASHMAPPED:
		case TREEMAPPED:
			formatMAPPED(out, dmoName, ad);
			break;
		}
		
	}
	
	private void formatSV(BufferedWriter out, String dmoName, AttributeDefinition ad) throws IOException {
    	String typeName 		= ad.getType().getName().getNameString();
    	boolean output = false;
    	
    	if (ad.getType().getIsRefType() && !ad.getType().getIsExtendedRefType()){
	        out.write("    ValueProvider<" + dmoName + ", " + typeName + "REF> " + ad.getName() + "();\n\n");
			output = true;
    	}	
    	else {
    		if (ad.getType().getIsExtendedRefType()){
    			out.write(    "// " + ad.getName() + " SV extended REF \n\n");
    			output = true;
    		}
    		else {
    	        out.write("    ValueProvider<" + dmoName + ", " + typeName + "> " + ad.getName() + "();\n\n");
    			output = true;
    		}
    	}
    	
    	if (!output)
    		out.write(    "// TODO: " + ad.getName() + " SV ???\n\n");
	}
	
	private void formatMV(BufferedWriter out, String dmoName, AttributeDefinition ad) throws IOException  {
    	String typeName 		= ad.getType().getName().getNameString();
    	boolean output = false;
    	
    	if (ad.getType().getIsRefType() && !ad.getType().getIsExtendedRefType()){
			out.write(    "//  TODO: " + ad.getName() + " MV REF \n\n");
			output = true;
    	}	
    	else {
    		if (ad.getType().getIsExtendedRefType()){
    			out.write(    "// " + ad.getName() + " MV extended REF \n\n");
    			output = true;
    		}
    		else {
    	        out.write("    ValueProvider<" + dmoName + ", Iterator<" + typeName + ">> " + ad.getName() + "();\n\n");
    			output = true;
    		}
    	}
    	
    	if (!output)
    		out.write(    "//  TODO: " + ad.getName() + " MV ???\n\n");
		
	}
	
	private void formatMAPPED(BufferedWriter out, String dmoName, AttributeDefinition ad) throws IOException  {
		out.write(    "// " + ad.getName() + " MAPPED ???\n\n");
		
	}
}
