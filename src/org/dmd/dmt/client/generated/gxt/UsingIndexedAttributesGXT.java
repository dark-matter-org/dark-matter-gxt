package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                // Support for MULTI attribute - (BaseDMWGenerator.java:2226)
import java.util.Iterator;                                                 // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                                      // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                          // Attribute indexedString from the dmt schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.shared.generated.dmo.UsingIndexedAttributesDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmt.shared.generated.types.SomeRelation;                    // DMO reference - (BaseDMWGenerator.java:1142)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                              // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class UsingIndexedAttributesGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:570)
    public UsingIndexedAttributesGXT() {
        super(new UsingIndexedAttributesDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:575)
    public UsingIndexedAttributesGXT(DmcTypeModifierMV mods) {
        super(new UsingIndexedAttributesDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public UsingIndexedAttributesGXT getModificationRecorder(){
        UsingIndexedAttributesGXT rc = new UsingIndexedAttributesGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public UsingIndexedAttributesDMO getDMO() {
        return((UsingIndexedAttributesDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:655)
    public UsingIndexedAttributesGXT(UsingIndexedAttributesDMO obj) {
        super(obj);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getIndexedStringSize(){
        return(((UsingIndexedAttributesDMO) core).getIndexedStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getIndexedStringIsEmpty(){
        if (((UsingIndexedAttributesDMO) core).getIndexedStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getIndexedStringHasValue(){
        if (((UsingIndexedAttributesDMO) core).getIndexedStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2120)
    public Iterator<String> getIndexedString(){
        return(((UsingIndexedAttributesDMO) core).getIndexedString());
    }

    /**
     * Adds another indexedString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addIndexedString(Object value) throws DmcValueException {
        ((UsingIndexedAttributesDMO) core).addIndexedString(value);
    }

    /**
     * Sets a indexedString value at the specified index.
     * @param index The index to set.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2154)
    public void setNthIndexedString(int index, String value){
        ((UsingIndexedAttributesDMO) core).setNthIndexedString(index, value);
    }

    /**
     * Gets the indexedString value at the specified index.
     * @param index The index to retreive.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    public String getNthIndexedString(int index){
        return(((UsingIndexedAttributesDMO) core).getNthIndexedString(index));
    }

    /**
     * Returns true if the collection contains the indexedString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean indexedStringContains(String value){
        return(((UsingIndexedAttributesDMO) core).indexedStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getIndexedStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__indexedString);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a indexedString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delIndexedString(Object value) throws DmcValueException {
        ((UsingIndexedAttributesDMO) core).delIndexedString(value);
    }

    /**
     * Deletes a indexedString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delIndexedString(String value){
        ((UsingIndexedAttributesDMO) core).delIndexedString(value);
    }

    /**
     * Removes the indexedString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remIndexedString(){
        ((UsingIndexedAttributesDMO) core).remIndexedString();
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getSomeRelationIndexedSize(){
        return(((UsingIndexedAttributesDMO) core).getSomeRelationIndexedSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getSomeRelationIndexedIsEmpty(){
        if (((UsingIndexedAttributesDMO) core).getSomeRelationIndexedSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getSomeRelationIndexedHasValue(){
        if (((UsingIndexedAttributesDMO) core).getSomeRelationIndexedSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the someRelationIndexed value at the specified index.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1946)
    public DmcAttribute<?> setNthSomeRelationIndexed(int index, SomeRelation value){
        return(((UsingIndexedAttributesDMO) core).setNthSomeRelationIndexed(index, value));
    }

    /**
     * @return The reference to the SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2045)
    public SomeRelation getNthSomeRelationIndexed(int index){
        return(((UsingIndexedAttributesDMO) core).getNthSomeRelationIndexed(index));
    }

    /**
     * @return The reference to the SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2079)
    public SomeRelation getNthSomeRelationIndexedREF(int index){
        return(((UsingIndexedAttributesDMO) core).getNthSomeRelationIndexedREF(index));
    }

    /**
     * Removes the someRelationIndexed attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remSomeRelationIndexed(){
        ((UsingIndexedAttributesDMO) core).remSomeRelationIndexed();
    }


}