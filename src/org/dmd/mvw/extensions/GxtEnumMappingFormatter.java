package org.dmd.mvw.extensions;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.forms.EnumMapping;
import org.dmd.mvw.tools.mvwgenerator.interfaces.MvwEnumMappingGeneratorIF;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.exceptions.DebugInfo;

public class GxtEnumMappingFormatter implements MvwEnumMappingGeneratorIF {
	
	public GxtEnumMappingFormatter(){
		
	}

	public void formatEnumMapping(String outdir, EnumMapping mapping) throws IOException {
		String genPackage = mapping.getDefinedInModule().getGenPackage();
		
		String 			name 	= Manipulator.capFirstChar(mapping.getMappingName().getNameString());
//		String 			name 	= GenUtility.capTheName(mapping.getMappingName().getNameString());
        BufferedWriter 	out 	= FileUpdateManager.instance().getWriter(outdir, name + ".java");
        ImportManager	imports = new ImportManager();
        
        imports.addImport("java.util.ArrayList", "Our mapping type");
        imports.addImport("java.util.List", "Required by combo box");
        imports.addImport("org.dmd.mvw.client.gxtforms.implementation.GxtEnumValue", "Our base enum representation");
        imports.addImport("org.dmd.mvw.client.gxtforms.implementation.GxtEnumMappingIF", "Our interface");

        out.write("package " + genPackage + ".generated.mvw.forms;\n\n");
        
        out.write(imports.getFormattedImports() + "\n");
        
        out.write("// " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + name + " implements GxtEnumMappingIF {\n\n");
        
        out.write("    static " + name + " instance;\n\n");
        
        if (mapping.getEmptyText() == null)
            out.write("    private String emptyText;\n\n");
        else
        	out.write("    private String emptyText = \"" + mapping.getEmptyText() + "\";\n\n");
        
        out.write("    final String enumName = \"" + mapping.getEnumName() + "\";\n\n");
        
        out.write(mapping.getStaticValues() + "\n");
        
        out.write(mapping.getConstructor());
        
        out.write("    public List<GxtEnumValue> getMapping(){\n");
        out.write("        return(mapping);\n");
        out.write("    }\n\n");

        out.write("    public String getEnumName(){\n");
        out.write("        return(enumName);\n");
        out.write("    }\n\n");

        out.write("    public String getEmptyText(){\n");
        out.write("        return(emptyText);\n");
        out.write("    }\n\n");

        out.write("}\n\n");
        
        out.close();
	}
}
