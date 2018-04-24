package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.Iterator;                                        // Support MV object get() - (BaseDMWGenerator.java:2431)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                 // Attribute objRefHM from the dmt schema - (BaseDMWGenerator.java:900)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;           // DMO reference - (BaseDMWGenerator.java:1142)
import org.dmd.dmt.shared.generated.dmo.UsingObjRefHMDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // Helper class - (BaseDMWGenerator.java:1145)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                     // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class UsingObjRefHMGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:570)
    public UsingObjRefHMGXT() {
        super(new UsingObjRefHMDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:575)
    public UsingObjRefHMGXT(DmcTypeModifierMV mods) {
        super(new UsingObjRefHMDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public UsingObjRefHMGXT getModificationRecorder(){
        UsingObjRefHMGXT rc = new UsingObjRefHMGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public UsingObjRefHMDMO getDMO() {
        return((UsingObjRefHMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:655)
    public UsingObjRefHMGXT(UsingObjRefHMDMO obj) {
        super(obj);
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2344)
    public int getObjRefHMSize(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2356)
    public boolean getObjRefHMIsEmpty(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2368)
    public boolean getObjRefHMHasValue(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed ObjWithRefs object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2397)
    public ObjWithRefsREF getObjRefHM(Object key){
        return(((UsingObjRefHMDMO) core).getObjRefHM(key));
    }

    /**
     * @return An Iterator of ObjWithRefsREFs.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2457)
    public Iterator<ObjWithRefsREF> getObjRefHM(){
        return(((UsingObjRefHMDMO) core).getObjRefHM());
    }

    /**
     * Adds another objRefHM value.
     * @param value ObjWithRefsGXT
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2483)
    public DmcAttribute<?> addObjRefHM(ObjWithRefsDMO value) {
        return(((UsingObjRefHMDMO) core).addObjRefHM(value));
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2507)
    public void delObjRefHM(ObjWithRefsDMO value){
        ((UsingObjRefHMDMO) core).delObjRefHM(value);
    }

    /**
     * Removes the objRefHM attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2699)
    public void remObjRefHM(){
        ((UsingObjRefHMDMO) core).remObjRefHM();
    }


}