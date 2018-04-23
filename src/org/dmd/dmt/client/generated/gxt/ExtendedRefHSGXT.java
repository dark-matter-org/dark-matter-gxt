package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.Iterator;                                        // Multi-valued attribute access - (BaseDMWGenerator.java:1727)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefHSDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmt.shared.generated.types.SomeRelation;           // DMO reference - (BaseDMWGenerator.java:1142)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                     // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class ExtendedRefHSGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:570)
    public ExtendedRefHSGXT() {
        super(new ExtendedRefHSDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:575)
    public ExtendedRefHSGXT(DmcTypeModifierMV mods) {
        super(new ExtendedRefHSDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public ExtendedRefHSGXT getModificationRecorder(){
        ExtendedRefHSGXT rc = new ExtendedRefHSGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public ExtendedRefHSDMO getDMO() {
        return((ExtendedRefHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:655)
    public ExtendedRefHSGXT(ExtendedRefHSDMO obj) {
        super(obj);
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getHsExtendedRefSize(){
        return(((ExtendedRefHSDMO) core).getHsExtendedRefSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getHsExtendedRefIsEmpty(){
        if (((ExtendedRefHSDMO) core).getHsExtendedRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getHsExtendedRefHasValue(){
        if (((ExtendedRefHSDMO) core).getHsExtendedRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1732)
    public Iterator<SomeRelation> getHsExtendedRef(){
        return(((ExtendedRefHSDMO) core).getHsExtendedRef());
    }

    /**
     * Adds another hsExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1787)
    public DmcAttribute<?> addHsExtendedRef(SomeRelation value){
        return(((ExtendedRefHSDMO) core).addHsExtendedRef(value));
    }

    /**
     * Deletes a hsExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1835)
    public void delHsExtendedRef(SomeRelation value){
        ((ExtendedRefHSDMO) core).delHsExtendedRef(value);
    }

    /**
     * Removes the hsExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remHsExtendedRef(){
        ((ExtendedRefHSDMO) core).remHsExtendedRef();
    }


}
