package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.Iterator;                                               // Multi-valued attribute access - (BaseDMWGeneratorNewest.java:1539)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;         // DMO reference - (BaseDMWGeneratorNewest.java:958)
import org.dmd.dmt.shared.generated.dmo.UnnamedObjMVDMO;                 // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                            // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class UnnamedObjMVGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:455)
    public UnnamedObjMVGXT() {
        super(new UnnamedObjMVDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:460)
    public UnnamedObjMVGXT(DmcTypeModifierMV mods) {
        super(new UnnamedObjMVDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public UnnamedObjMVGXT getModificationRecorder(){
        UnnamedObjMVGXT rc = new UnnamedObjMVGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public UnnamedObjMVDMO getDMO() {
        return((UnnamedObjMVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:540)
    public UnnamedObjMVGXT(UnnamedObjMVDMO obj) {
        super(obj);
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getMvUnnamedObjSize(){
        return(((UnnamedObjMVDMO) core).getMvUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getMvUnnamedObjIsEmpty(){
        if (((UnnamedObjMVDMO) core).getMvUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getMvUnnamedObjHasValue(){
        if (((UnnamedObjMVDMO) core).getMvUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1544)
    public Iterator<TestBasicObjectFixedDMO> getMvUnnamedObj(){
        return(((UnnamedObjMVDMO) core).getMvUnnamedObj());
    }

    /**
     * Adds another mvUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixedDMO
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1609)
    public DmcAttribute<?> addMvUnnamedObj(TestBasicObjectFixedDMO value){
        return(((UnnamedObjMVDMO) core).addMvUnnamedObj(value));
    }

    /**
     * Deletes a mvUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1657)
    public void delMvUnnamedObj(TestBasicObjectFixedDMO value){
        ((UnnamedObjMVDMO) core).delMvUnnamedObj(value);
    }

    /**
     * Removes the mvUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remMvUnnamedObj(){
        ((UnnamedObjMVDMO) core).remMvUnnamedObj();
    }


}
