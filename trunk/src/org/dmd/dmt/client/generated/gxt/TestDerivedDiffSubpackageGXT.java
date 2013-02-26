package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.ArrayList;                                                   // Support for MULTI attribute - (BaseDMWGeneratorNewest.java:2042)
import java.util.Iterator;                                                    // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2054)
import org.dmd.dmc.*;                                                         // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dmc.types.StringName;                                          // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:894)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.dmt.client.generated.gxt.TestOneLevelSubpackageGXT;            // Derived class - (BaseDMWGeneratorNewest.java:1066)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                             // Attribute mvString from the dmt schema - (BaseDMWGeneratorNewest.java:733)
import org.dmd.dmt.shared.generated.dmo.TestDerivedDiffSubpackageDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)


/**
 * The TestDerivedDiffSubpackage test derivation from a different subpackage.
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class TestDerivedDiffSubpackageGXT extends TestOneLevelSubpackageGXT implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:455)
    public TestDerivedDiffSubpackageGXT() {
        super(new TestDerivedDiffSubpackageDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:460)
    public TestDerivedDiffSubpackageGXT(DmcTypeModifierMV mods) {
        super(new TestDerivedDiffSubpackageDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:500)
    public TestDerivedDiffSubpackageGXT getModificationRecorder(){
        TestDerivedDiffSubpackageGXT rc = new TestDerivedDiffSubpackageGXT();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public TestDerivedDiffSubpackageDMO getDMO() {
        return((TestDerivedDiffSubpackageDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:540)
    public TestDerivedDiffSubpackageGXT(TestDerivedDiffSubpackageDMO obj) {
        super(obj);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1115)
    public StringName getObjectName(){
        return(((TestDerivedDiffSubpackageDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestDerivedDiffSubpackageDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestDerivedDiffSubpackageGXT){
            return( getObjectName().equals( ((TestDerivedDiffSubpackageGXT) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getMvStringSize(){
        return(((TestDerivedDiffSubpackageDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getMvStringIsEmpty(){
        if (((TestDerivedDiffSubpackageDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getMvStringHasValue(){
        if (((TestDerivedDiffSubpackageDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1936)
    public Iterator<String> getMvString(){
        return(((TestDerivedDiffSubpackageDMO) core).getMvString());
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1949)
    public void addMvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1959)
    public void addMvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2016)
    public boolean mvStringContains(String value){
        return(((TestDerivedDiffSubpackageDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2058)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
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
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2085)
    public void delMvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2094)
    public void delMvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2106)
    public void remMvString(){
        ((TestDerivedDiffSubpackageDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public StringName getName(){
        return(((TestDerivedDiffSubpackageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setName(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setName(StringName value){
        ((TestDerivedDiffSubpackageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remName(){
        ((TestDerivedDiffSubpackageDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getSvString(){
        return(((TestDerivedDiffSubpackageDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setSvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setSvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remSvString(){
        ((TestDerivedDiffSubpackageDMO) core).remSvString();
    }


}
