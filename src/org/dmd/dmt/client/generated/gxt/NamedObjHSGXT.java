package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.Iterator;                                        // Multi-valued attribute access - (BaseDMWGenerator.java:1617)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.shared.generated.dmo.NamedObjHSDMO;            // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;           // DMO reference - (BaseDMWGenerator.java:1032)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // Helper class - (BaseDMWGenerator.java:1035)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                     // Unnamed object wrapper - (BaseDMWGenerator.java:1125)



/**
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class NamedObjHSGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:589)
    public NamedObjHSGXT() {
        super(new NamedObjHSDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:594)
    public NamedObjHSGXT(DmcTypeModifierMV mods) {
        super(new NamedObjHSDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:612)
    public NamedObjHSGXT getModificationRecorder(){
        NamedObjHSGXT rc = new NamedObjHSGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public NamedObjHSDMO getDMO() {
        return((NamedObjHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:674)
    public NamedObjHSGXT(NamedObjHSDMO obj) {
        super(obj);
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getHsNamedObjSize(){
        return(((NamedObjHSDMO) core).getHsNamedObjSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getHsNamedObjIsEmpty(){
        if (((NamedObjHSDMO) core).getHsNamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getHsNamedObjHasValue(){
        if (((NamedObjHSDMO) core).getHsNamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1622)
    public Iterator<ObjWithRefsREF> getHsNamedObj(){
        return(((NamedObjHSDMO) core).getHsNamedObj());
    }

    /**
     * Adds another hsNamedObj value.
     * @param value A value compatible with ObjWithRefsDMO
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1687)
    public DmcAttribute<?> addHsNamedObj(ObjWithRefsDMO value){
        return(((NamedObjHSDMO) core).addHsNamedObj(value));
    }

    /**
     * Deletes a hsNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1735)
    public void delHsNamedObj(ObjWithRefsDMO value){
        ((NamedObjHSDMO) core).delHsNamedObj(value);
    }

    /**
     * Removes the hsNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remHsNamedObj(){
        ((NamedObjHSDMO) core).remHsNamedObj();
    }


}
