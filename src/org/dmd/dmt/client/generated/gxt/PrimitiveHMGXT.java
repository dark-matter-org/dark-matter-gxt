package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.Iterator;                                      // Multi-valued attribute access - (BaseDMWGenerator.java:2581)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.types.StringToString;                        // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;               // Attribute hmString from the dmt schema - (BaseDMWGenerator.java:900)
import org.dmd.dmt.shared.generated.dmo.PrimitiveHMDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                   // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class PrimitiveHMGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:570)
    public PrimitiveHMGXT() {
        super(new PrimitiveHMDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:575)
    public PrimitiveHMGXT(DmcTypeModifierMV mods) {
        super(new PrimitiveHMDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public PrimitiveHMGXT getModificationRecorder(){
        PrimitiveHMGXT rc = new PrimitiveHMGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public PrimitiveHMDMO getDMO() {
        return((PrimitiveHMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:655)
    public PrimitiveHMGXT(PrimitiveHMDMO obj) {
        super(obj);
    }

    /**
     * @return The number of StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2344)
    public int getHmStringSize(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2356)
    public boolean getHmStringIsEmpty(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2368)
    public boolean getHmStringHasValue(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed StringToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2397)
    public StringToString getHmString(Object key){
        return(((PrimitiveHMDMO) core).getHmString(key));
    }

    /**
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2585)
    public Iterator<StringToString> getHmString(){
        return(((PrimitiveHMDMO) core).getHmString());
    }

    /**
     * Adds another hmString value.
     * @param value A value compatible with StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2598)
    public void addHmString(Object value) throws DmcValueException {
        ((PrimitiveHMDMO) core).addHmString(value);
    }

    /**
     * Adds another hmString value.
     * @param value StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2607)
    public void addHmString(StringToString value) {
        ((PrimitiveHMDMO) core).addHmString(value);
    }

    /**
     * Deletes a hmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2619)
    public void delHmString(Object value){
        ((PrimitiveHMDMO) core).delHmString(value);
    }

    /**
     * Deletes a hmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2628)
    public void delHmString(String value){
        ((PrimitiveHMDMO) core).delHmString(value);
    }

    /**
     * Removes the hmString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2699)
    public void remHmString(){
        ((PrimitiveHMDMO) core).remHmString();
    }


}
