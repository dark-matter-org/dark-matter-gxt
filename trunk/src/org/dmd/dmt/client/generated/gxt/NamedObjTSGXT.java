package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.Iterator;                                        // Multi-valued attribute access - (BaseDMWGeneratorNewest.java:1545)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:894)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.dmt.shared.generated.dmo.NamedObjTSDMO;            // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;           // DMO reference - (BaseDMWGeneratorNewest.java:960)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // Helper class - (BaseDMWGeneratorNewest.java:963)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                     // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1053)


/**
 * null
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class NamedObjTSGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:455)
    public NamedObjTSGXT() {
        super(new NamedObjTSDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:460)
    public NamedObjTSGXT(DmcTypeModifierMV mods) {
        super(new NamedObjTSDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public NamedObjTSGXT getModificationRecorder(){
        NamedObjTSGXT rc = new NamedObjTSGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public NamedObjTSDMO getDMO() {
        return((NamedObjTSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:540)
    public NamedObjTSGXT(NamedObjTSDMO obj) {
        super(obj);
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getTsNamedObjSize(){
        return(((NamedObjTSDMO) core).getTsNamedObjSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getTsNamedObjIsEmpty(){
        if (((NamedObjTSDMO) core).getTsNamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getTsNamedObjHasValue(){
        if (((NamedObjTSDMO) core).getTsNamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1550)
    public Iterator<ObjWithRefsREF> getTsNamedObj(){
        return(((NamedObjTSDMO) core).getTsNamedObj());
    }

    /**
     * Adds another tsNamedObj value.
     * @param value A value compatible with ObjWithRefsDMO
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1615)
    public DmcAttribute<?> addTsNamedObj(ObjWithRefsDMO value){
        return(((NamedObjTSDMO) core).addTsNamedObj(value));
    }

    /**
     * Deletes a tsNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1663)
    public void delTsNamedObj(ObjWithRefsDMO value){
        ((NamedObjTSDMO) core).delTsNamedObj(value);
    }

    /**
     * Removes the tsNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2106)
    public void remTsNamedObj(){
        ((NamedObjTSDMO) core).remTsNamedObj();
    }


}