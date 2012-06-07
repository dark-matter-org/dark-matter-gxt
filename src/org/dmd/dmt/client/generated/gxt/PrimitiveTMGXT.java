package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.Iterator;                                      // Multi-valued attribute access - (BaseDMWGeneratorNewest.java:2387)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.StringToString;                        // Primitive type - (BaseDMWGeneratorNewest.java:966)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;               // Attribute tmString from the dmt schema - (BaseDMWGeneratorNewest.java:723)
import org.dmd.dmt.shared.generated.dmo.PrimitiveTMDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                   // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class PrimitiveTMGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:455)
    public PrimitiveTMGXT() {
        super(new PrimitiveTMDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:460)
    public PrimitiveTMGXT(DmcTypeModifierMV mods) {
        super(new PrimitiveTMDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public PrimitiveTMGXT getModificationRecorder(){
        PrimitiveTMGXT rc = new PrimitiveTMGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public PrimitiveTMDMO getDMO() {
        return((PrimitiveTMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:540)
    public PrimitiveTMGXT(PrimitiveTMDMO obj) {
        super(obj);
    }

    /**
     * @return The number of StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2152)
    public int getTmStringSize(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2164)
    public boolean getTmStringIsEmpty(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2176)
    public boolean getTmStringHasValue(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed StringToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2205)
    public StringToString getTmString(Object key){
        return(((PrimitiveTMDMO) core).getTmString(key));
    }

    /**
     * @return the first key of the map.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2223)
    public String getTmStringFirstKey(){
        return(((PrimitiveTMDMO) core).getTmStringFirstKey());
    }

    /**
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2391)
    public Iterator<StringToString> getTmString(){
        return(((PrimitiveTMDMO) core).getTmString());
    }

    /**
     * Adds another tmString value.
     * @param value A value compatible with StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2404)
    public void addTmString(Object value) throws DmcValueException {
        ((PrimitiveTMDMO) core).addTmString(value);
    }

    /**
     * Adds another tmString value.
     * @param value StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2413)
    public void addTmString(StringToString value) {
        ((PrimitiveTMDMO) core).addTmString(value);
    }

    /**
     * Deletes a tmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2425)
    public void delTmString(Object value){
        ((PrimitiveTMDMO) core).delTmString(value);
    }

    /**
     * Deletes a tmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2434)
    public void delTmString(String value){
        ((PrimitiveTMDMO) core).delTmString(value);
    }

    /**
     * Removes the tmString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2503)
    public void remTmString(){
        ((PrimitiveTMDMO) core).remTmString();
    }


}
