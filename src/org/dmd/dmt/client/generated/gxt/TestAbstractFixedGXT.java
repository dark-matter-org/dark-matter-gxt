package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.generated.enums.ValueTypeEnum;                     // To allow overload of GxtWrapper.set() - (GxtDMWGenerator.java:122)
import org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO;         // Abstract class - (BaseDMWGenerator.java:1230)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                         // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * The TestAbstract class just defines an abstract base class from which\n
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class TestAbstractFixedGXT extends GxtWrapper {


    static final int svStringID = 10141;

    protected TestAbstractFixedGXT() {
        super();
    }

    abstract public TestAbstractFixedGXT getModificationRecorder();

    public TestAbstractFixedDMO getDMO() {
        return((TestAbstractFixedDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:649)
    protected TestAbstractFixedGXT(TestAbstractFixedDMO obj) {
        super(obj);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getSvString(){
        return(((TestAbstractFixedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setSvString(Object value) throws DmcValueException {
        ((TestAbstractFixedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setSvString(String value){
        ((TestAbstractFixedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remSvString(){
        ((TestAbstractFixedDMO) core).remSvString();
    }


}