package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.Iterator;                                        // Multi-valued attribute access - (BaseDMWGenerator.java:1617)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmt.shared.generated.types.SomeRelation;           // DMO reference - (BaseDMWGenerator.java:1032)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                     // Unnamed object wrapper - (BaseDMWGenerator.java:1125)



/**
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class ExtendedRefMVGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:589)
    public ExtendedRefMVGXT() {
        super(new ExtendedRefMVDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:594)
    public ExtendedRefMVGXT(DmcTypeModifierMV mods) {
        super(new ExtendedRefMVDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:612)
    public ExtendedRefMVGXT getModificationRecorder(){
        ExtendedRefMVGXT rc = new ExtendedRefMVGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public ExtendedRefMVDMO getDMO() {
        return((ExtendedRefMVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:674)
    public ExtendedRefMVGXT(ExtendedRefMVDMO obj) {
        super(obj);
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getMvExtendedRefSize(){
        return(((ExtendedRefMVDMO) core).getMvExtendedRefSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getMvExtendedRefIsEmpty(){
        if (((ExtendedRefMVDMO) core).getMvExtendedRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getMvExtendedRefHasValue(){
        if (((ExtendedRefMVDMO) core).getMvExtendedRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1622)
    public Iterator<SomeRelation> getMvExtendedRef(){
        return(((ExtendedRefMVDMO) core).getMvExtendedRef());
    }

    /**
     * Adds another mvExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1677)
    public DmcAttribute<?> addMvExtendedRef(SomeRelation value){
        return(((ExtendedRefMVDMO) core).addMvExtendedRef(value));
    }

    /**
     * Deletes a mvExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1725)
    public void delMvExtendedRef(SomeRelation value){
        ((ExtendedRefMVDMO) core).delMvExtendedRef(value);
    }

    /**
     * Removes the mvExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remMvExtendedRef(){
        ((ExtendedRefMVDMO) core).remMvExtendedRef();
    }


}
