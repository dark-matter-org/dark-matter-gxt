package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                  // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.IntegerName;                                  // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.enums.ValueTypeEnum;                      // To allow overload of GxtWrapper.set() - (GxtDMWGenerator.java:122)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.mvw.client.gxt.dmw.GxtNamedObjectWrapper;               // Named object wrapper - (BaseDMWGenerator.java:1132)



/**
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class IntegerNamedObjectGXT extends GxtNamedObjectWrapper implements DmcNamedObjectIF {


    static final int integerNameID = 100;
    static final int svStringID = 10141;

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:589)
    public IntegerNamedObjectGXT() {
        super(new IntegerNamedObjectDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:594)
    public IntegerNamedObjectGXT(DmcTypeModifierMV mods) {
        super(new IntegerNamedObjectDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:634)
    public IntegerNamedObjectGXT getModificationRecorder(){
        IntegerNamedObjectGXT rc = new IntegerNamedObjectGXT();
        rc.setIntegerName(getIntegerName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public IntegerNamedObjectDMO getDMO() {
        return((IntegerNamedObjectDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:674)
    public IntegerNamedObjectGXT(IntegerNamedObjectDMO obj) {
        super(obj);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public IntegerName getObjectName(){
        return(((IntegerNamedObjectDMO) core).getIntegerName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((IntegerNamedObjectDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof IntegerNamedObjectGXT){
            return( getObjectName().equals( ((IntegerNamedObjectGXT) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public IntegerName getIntegerName(){
        return(((IntegerNamedObjectDMO) core).getIntegerName());
    }

    /**
     * Sets integerName to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setIntegerName(Object value) throws DmcValueException {
        ((IntegerNamedObjectDMO) core).setIntegerName(value);
    }

    /**
     * Sets integerName to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setIntegerName(IntegerName value){
        ((IntegerNamedObjectDMO) core).setIntegerName(value);
    }

    /**
     * Removes the integerName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remIntegerName(){
        ((IntegerNamedObjectDMO) core).remIntegerName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getSvString(){
        return(((IntegerNamedObjectDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSvString(Object value) throws DmcValueException {
        ((IntegerNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSvString(String value){
        ((IntegerNamedObjectDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSvString(){
        ((IntegerNamedObjectDMO) core).remSvString();
    }


}
