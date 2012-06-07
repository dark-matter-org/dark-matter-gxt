package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.Date;                                           // Primitive type - (BaseDMWGeneratorNewest.java:966)
import org.dmd.dmc.*;                                            // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.StringName;                             // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dmt.shared.generated.dmo.BaseObjDMO;              // Abstract class - (BaseDMWGeneratorNewest.java:1046)
import org.dmd.mvw.client.gxt.dmw.GxtNamedObjectWrapper;         // Named object wrapper - (BaseDMWGeneratorNewest.java:1058)


/**
 * null
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class BaseObjGXT extends GxtNamedObjectWrapper implements DmcNamedObjectIF {

    protected BaseObjGXT() {
        super();
    }

    abstract public BaseObjGXT getModificationRecorder();

    public BaseObjDMO getDMO() {
        return((BaseObjDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:534)
    protected BaseObjGXT(BaseObjDMO obj) {
        super(obj);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1113)
    public StringName getObjectName(){
        return(((BaseObjDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((BaseObjDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof BaseObjGXT){
            return( getObjectName().equals( ((BaseObjGXT) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public StringName getName(){
        return(((BaseObjDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setName(Object value) throws DmcValueException {
        ((BaseObjDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setName(StringName value){
        ((BaseObjDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remName(){
        ((BaseObjDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public Date getSvDate(){
        return(((BaseObjDMO) core).getSvDate());
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDate
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setSvDate(Object value) throws DmcValueException {
        ((BaseObjDMO) core).setSvDate(value);
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setSvDate(Date value){
        ((BaseObjDMO) core).setSvDate(value);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remSvDate(){
        ((BaseObjDMO) core).remSvDate();
    }


}
