package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.DmcObjectName;                                     // Alternative type for NameContainer values - (BaseDMWGenerator.java:1048)
import org.dmd.dmc.types.NameContainer;                               // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.enums.ValueTypeEnum;                     // To allow overload of GxtWrapper.set() - (GxtDMWGenerator.java:122)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmt.shared.types.DmtStringName;                        // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                         // Unnamed object wrapper - (BaseDMWGenerator.java:1125)



/**
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class NameContainerTestGXT extends GxtWrapper {


    static final int anObjNameID = 10900;
    static final int anotherDmtNameID = 10902;
    static final int dmtStringNameID = 10901;

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:589)
    public NameContainerTestGXT() {
        super(new NameContainerTestDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:594)
    public NameContainerTestGXT(DmcTypeModifierMV mods) {
        super(new NameContainerTestDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:612)
    public NameContainerTestGXT getModificationRecorder(){
        NameContainerTestGXT rc = new NameContainerTestGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public NameContainerTestDMO getDMO() {
        return((NameContainerTestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:674)
    public NameContainerTestGXT(NameContainerTestDMO obj) {
        super(obj);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public NameContainer getAnObjName(){
        return(((NameContainerTestDMO) core).getAnObjName());
    }

    /**
     * Sets anObjName to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setAnObjName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setAnObjName(NameContainer value){
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1497)
    public void setAnObjName(DmcObjectName value){
        ((NameContainerTestDMO) core).setAnObjName(value);
    }

    /**
     * Removes the anObjName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remAnObjName(){
        ((NameContainerTestDMO) core).remAnObjName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DmtStringName getAnotherDmtName(){
        return(((NameContainerTestDMO) core).getAnotherDmtName());
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setAnotherDmtName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setAnotherDmtName(value);
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setAnotherDmtName(DmtStringName value){
        ((NameContainerTestDMO) core).setAnotherDmtName(value);
    }

    /**
     * Removes the anotherDmtName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remAnotherDmtName(){
        ((NameContainerTestDMO) core).remAnotherDmtName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DmtStringName getDmtStringName(){
        return(((NameContainerTestDMO) core).getDmtStringName());
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setDmtStringName(Object value) throws DmcValueException {
        ((NameContainerTestDMO) core).setDmtStringName(value);
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setDmtStringName(DmtStringName value){
        ((NameContainerTestDMO) core).setDmtStringName(value);
    }

    /**
     * Removes the dmtStringName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remDmtStringName(){
        ((NameContainerTestDMO) core).remDmtStringName();
    }


}
