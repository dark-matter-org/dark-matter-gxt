package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                  // Support for MULTI attribute - (BaseDMWGenerator.java:2226)
import java.util.Iterator;                                                   // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                                        // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.enums.ValueTypeEnum;                            // To allow overload of GxtWrapper.set() - (GxtDMWGenerator.java:122)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.shared.generated.dmo.ComplexTypeTestDMO;                  // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                            // Attribute mvComplex from the dmt schema - (BaseDMWGenerator.java:910)
import org.dmd.dmt.shared.generated.types.MenuElementTypeAndComment;         // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                                // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class ComplexTypeTestGXT extends GxtWrapper {


    static final int svComplexID = 10928;

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:570)
    public ComplexTypeTestGXT() {
        super(new ComplexTypeTestDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:575)
    public ComplexTypeTestGXT(DmcTypeModifierMV mods) {
        super(new ComplexTypeTestDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public ComplexTypeTestGXT getModificationRecorder(){
        ComplexTypeTestGXT rc = new ComplexTypeTestGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public ComplexTypeTestDMO getDMO() {
        return((ComplexTypeTestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:655)
    public ComplexTypeTestGXT(ComplexTypeTestDMO obj) {
        super(obj);
    }

    /**
     * @return The number of MenuElementTypeAndComment items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getMvComplexSize(){
        return(((ComplexTypeTestDMO) core).getMvComplexSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getMvComplexIsEmpty(){
        if (((ComplexTypeTestDMO) core).getMvComplexSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getMvComplexHasValue(){
        if (((ComplexTypeTestDMO) core).getMvComplexSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2120)
    public Iterator<MenuElementTypeAndComment> getMvComplex(){
        return(((ComplexTypeTestDMO) core).getMvComplex());
    }

    /**
     * Adds another mvComplex value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addMvComplex(Object value) throws DmcValueException {
        ((ComplexTypeTestDMO) core).addMvComplex(value);
    }

    /**
     * Adds another mvComplex value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addMvComplex(MenuElementTypeAndComment value){
        ((ComplexTypeTestDMO) core).addMvComplex(value);
    }

    /**
     * Returns true if the collection contains the mvComplex value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean mvComplexContains(MenuElementTypeAndComment value){
        return(((ComplexTypeTestDMO) core).mvComplexContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<MenuElementTypeAndComment> getMvComplexCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvComplex);
        if (attr == null)
            return(new ArrayList<MenuElementTypeAndComment>());
        
        ArrayList<MenuElementTypeAndComment> rc = new ArrayList<MenuElementTypeAndComment>(attr.getMVSize());
        
        Iterator<MenuElementTypeAndComment> it = (Iterator<MenuElementTypeAndComment>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvComplex value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delMvComplex(Object value) throws DmcValueException {
        ((ComplexTypeTestDMO) core).delMvComplex(value);
    }

    /**
     * Deletes a mvComplex value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delMvComplex(MenuElementTypeAndComment value){
        ((ComplexTypeTestDMO) core).delMvComplex(value);
    }

    /**
     * Removes the mvComplex attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remMvComplex(){
        ((ComplexTypeTestDMO) core).remMvComplex();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public MenuElementTypeAndComment getSvComplex(){
        return(((ComplexTypeTestDMO) core).getSvComplex());
    }

    /**
     * Sets svComplex to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setSvComplex(Object value) throws DmcValueException {
        ((ComplexTypeTestDMO) core).setSvComplex(value);
    }

    /**
     * Sets svComplex to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setSvComplex(MenuElementTypeAndComment value){
        ((ComplexTypeTestDMO) core).setSvComplex(value);
    }

    /**
     * Removes the svComplex attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remSvComplex(){
        ((ComplexTypeTestDMO) core).remSvComplex();
    }


}
