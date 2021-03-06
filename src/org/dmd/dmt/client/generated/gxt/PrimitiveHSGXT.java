package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.HashSet;                                       // To support getMVCopy() - (BaseDMWGenerator.java:1090)
import java.util.Iterator;                                      // Support copy of MV objects - (BaseDMWGenerator.java:2130)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;               // Attribute hsString from the dmt schema - (BaseDMWGenerator.java:923)
import org.dmd.dmt.shared.generated.dmo.PrimitiveHSDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                   // Unnamed object wrapper - (BaseDMWGenerator.java:1125)



/**
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class PrimitiveHSGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:589)
    public PrimitiveHSGXT() {
        super(new PrimitiveHSDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:594)
    public PrimitiveHSGXT(DmcTypeModifierMV mods) {
        super(new PrimitiveHSDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:612)
    public PrimitiveHSGXT getModificationRecorder(){
        PrimitiveHSGXT rc = new PrimitiveHSGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public PrimitiveHSDMO getDMO() {
        return((PrimitiveHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:674)
    public PrimitiveHSGXT(PrimitiveHSDMO obj) {
        super(obj);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getHsStringSize(){
        return(((PrimitiveHSDMO) core).getHsStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getHsStringIsEmpty(){
        if (((PrimitiveHSDMO) core).getHsStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getHsStringHasValue(){
        if (((PrimitiveHSDMO) core).getHsStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2010)
    public Iterator<String> getHsString(){
        return(((PrimitiveHSDMO) core).getHsString());
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addHsString(Object value) throws DmcValueException {
        ((PrimitiveHSDMO) core).addHsString(value);
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addHsString(String value){
        ((PrimitiveHSDMO) core).addHsString(value);
    }

    /**
     * Returns true if the collection contains the hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean hsStringContains(String value){
        return(((PrimitiveHSDMO) core).hsStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public HashSet<String> getHsStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsString);
        if (attr == null)
            return(new HashSet<String>());
        
        HashSet<String> rc = new HashSet<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delHsString(Object value) throws DmcValueException {
        ((PrimitiveHSDMO) core).delHsString(value);
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delHsString(String value){
        ((PrimitiveHSDMO) core).delHsString(value);
    }

    /**
     * Removes the hsString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remHsString(){
        ((PrimitiveHSDMO) core).remHsString();
    }


}
