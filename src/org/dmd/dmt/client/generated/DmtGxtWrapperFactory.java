package org.dmd.dmt.client.generated;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.gxt.dmw.generators.GxtDMWGenerator.createAutoWrapperNEW(GxtDMWGenerator.java:342)
import org.dmd.dmc.DmcObject;                                  // The object we wrap - (GxtDMWGenerator.java:383)
import org.dmd.dmt.client.generated.gxt.*;                     // Access to the wrappers for the dmt schema - (GxtDMWGenerator.java:441)
import org.dmd.dmt.shared.generated.dmo.*;                     // Access to the DMOs for the dmt schema - (GxtDMWGenerator.java:442)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                  // The wrapper we return - (GxtDMWGenerator.java:384)
import org.dmd.mvw.client.gxt.dmw.GxtWrapperFactoryIF;         // The standard wrapper util interface - (GxtDMWGenerator.java:385)


// Generated from: org.dmd.mvw.gxt.dmw.generators.GxtDMWGenerator.createAutoWrapperNEW(GxtDMWGenerator.java:345)
public class DmtGxtWrapperFactory implements GxtWrapperFactoryIF {

    static final int ClientCountFilterID = 20017;
    static final int ComplexTypeTestID = 20409;
    static final int ExtendedRefHSID = 20406;
    static final int ExtendedRefMVID = 20402;
    static final int ExtendedRefMVIDXID = 20403;
    static final int ExtendedRefSVID = 20401;
    static final int ExtendedRefTSID = 20407;
    static final int IntegerNamedObjectID = 20013;
    static final int NameContainerTestID = 20014;
    static final int NamedObjHMID = 20204;
    static final int NamedObjHSID = 20206;
    static final int NamedObjMVID = 20202;
    static final int NamedObjMVIDXID = 20203;
    static final int NamedObjSVID = 20201;
    static final int NamedObjTMID = 20205;
    static final int NamedObjTSID = 20207;
    static final int ObjWithRefsID = 20016;
    static final int ObjWithRefsDerivedAID = 20021;
    static final int ObjWithRefsDerivedBID = 20022;
    static final int ParseTestID = 20408;
    static final int PrimitiveHMID = 20104;
    static final int PrimitiveHSID = 20106;
    static final int PrimitiveMVID = 20102;
    static final int PrimitiveMVIDXID = 20103;
    static final int PrimitiveSVID = 20101;
    static final int PrimitiveTMID = 20105;
    static final int PrimitiveTSID = 20107;
    static final int TestBasicAuxiliaryID = 20006;
    static final int TestBasicNamedObjectExtendedID = 20005;
    static final int TestBasicNamedObjectFixedID = 20004;
    static final int TestBasicObjectFixedID = 20003;
    static final int TestDerivedDiffSubpackageID = 20011;
    static final int TestDerivedSubpackageID = 20010;
    static final int TestMultiLevelSubpackageID = 20009;
    static final int TestOneLevelSubpackageID = 20007;
    static final int TestOneLevelSubpackageExtendedID = 20008;
    static final int UUIDNamedObjectID = 20012;
    static final int UnnamedObjHSID = 20306;
    static final int UnnamedObjMVID = 20302;
    static final int UnnamedObjMVIDXID = 20303;
    static final int UnnamedObjSVID = 20301;
    static final int UnnamedObjTSID = 20307;
    static final int UsingIndexedAttributesID = 20019;
    static final int UsingObjRefHMID = 20020;


    static DmtGxtWrapperFactory instance;

    private DmtGxtWrapperFactory(){

    }

    static public DmtGxtWrapperFactory instance(){
        if (instance == null)
            instance = new DmtGxtWrapperFactory();
        return(instance);
    }

    public GxtWrapper wrapObject(DmcObject obj){

        GxtWrapper rc = null;

        switch(obj.getConstructionClassInfo().id){
        case ClientCountFilterID:
            rc = new ClientCountFilterGXT((ClientCountFilterDMO)obj);
            break;
        case ComplexTypeTestID:
            rc = new ComplexTypeTestGXT((ComplexTypeTestDMO)obj);
            break;
        case ExtendedRefHSID:
            rc = new ExtendedRefHSGXT((ExtendedRefHSDMO)obj);
            break;
        case ExtendedRefMVID:
            rc = new ExtendedRefMVGXT((ExtendedRefMVDMO)obj);
            break;
        case ExtendedRefMVIDXID:
            rc = new ExtendedRefMVIDXGXT((ExtendedRefMVIDXDMO)obj);
            break;
        case ExtendedRefSVID:
            rc = new ExtendedRefSVGXT((ExtendedRefSVDMO)obj);
            break;
        case ExtendedRefTSID:
            rc = new ExtendedRefTSGXT((ExtendedRefTSDMO)obj);
            break;
        case IntegerNamedObjectID:
            rc = new IntegerNamedObjectGXT((IntegerNamedObjectDMO)obj);
            break;
        case NameContainerTestID:
            rc = new NameContainerTestGXT((NameContainerTestDMO)obj);
            break;
        case NamedObjHMID:
            rc = new NamedObjHMGXT((NamedObjHMDMO)obj);
            break;
        case NamedObjHSID:
            rc = new NamedObjHSGXT((NamedObjHSDMO)obj);
            break;
        case NamedObjMVID:
            rc = new NamedObjMVGXT((NamedObjMVDMO)obj);
            break;
        case NamedObjMVIDXID:
            rc = new NamedObjMVIDXGXT((NamedObjMVIDXDMO)obj);
            break;
        case NamedObjSVID:
            rc = new NamedObjSVGXT((NamedObjSVDMO)obj);
            break;
        case NamedObjTMID:
            rc = new NamedObjTMGXT((NamedObjTMDMO)obj);
            break;
        case NamedObjTSID:
            rc = new NamedObjTSGXT((NamedObjTSDMO)obj);
            break;
        case ObjWithRefsID:
            rc = new ObjWithRefsGXT((ObjWithRefsDMO)obj);
            break;
        case ObjWithRefsDerivedAID:
            rc = new ObjWithRefsDerivedAGXT((ObjWithRefsDerivedADMO)obj);
            break;
        case ObjWithRefsDerivedBID:
            rc = new ObjWithRefsDerivedBGXT((ObjWithRefsDerivedBDMO)obj);
            break;
        case ParseTestID:
            rc = new ParseTestGXT((ParseTestDMO)obj);
            break;
        case PrimitiveHMID:
            rc = new PrimitiveHMGXT((PrimitiveHMDMO)obj);
            break;
        case PrimitiveHSID:
            rc = new PrimitiveHSGXT((PrimitiveHSDMO)obj);
            break;
        case PrimitiveMVID:
            rc = new PrimitiveMVGXT((PrimitiveMVDMO)obj);
            break;
        case PrimitiveMVIDXID:
            rc = new PrimitiveMVIDXGXT((PrimitiveMVIDXDMO)obj);
            break;
        case PrimitiveSVID:
            rc = new PrimitiveSVGXT((PrimitiveSVDMO)obj);
            break;
        case PrimitiveTMID:
            rc = new PrimitiveTMGXT((PrimitiveTMDMO)obj);
            break;
        case PrimitiveTSID:
            rc = new PrimitiveTSGXT((PrimitiveTSDMO)obj);
            break;
        case TestBasicNamedObjectExtendedID:
            rc = new TestBasicNamedObjectExtendedGXT((TestBasicNamedObjectExtendedDMO)obj);
            break;
        case TestBasicNamedObjectFixedID:
            rc = new TestBasicNamedObjectFixedGXT((TestBasicNamedObjectFixedDMO)obj);
            break;
        case TestBasicObjectFixedID:
            rc = new TestBasicObjectFixedGXT((TestBasicObjectFixedDMO)obj);
            break;
        case TestDerivedDiffSubpackageID:
            rc = new TestDerivedDiffSubpackageGXT((TestDerivedDiffSubpackageDMO)obj);
            break;
        case TestDerivedSubpackageID:
            rc = new TestDerivedSubpackageGXT((TestDerivedSubpackageDMO)obj);
            break;
        case TestMultiLevelSubpackageID:
            rc = new TestMultiLevelSubpackageGXT((TestMultiLevelSubpackageDMO)obj);
            break;
        case TestOneLevelSubpackageID:
            rc = new TestOneLevelSubpackageGXT((TestOneLevelSubpackageDMO)obj);
            break;
        case TestOneLevelSubpackageExtendedID:
            rc = new TestOneLevelSubpackageExtendedGXT((TestOneLevelSubpackageExtendedDMO)obj);
            break;
        case UUIDNamedObjectID:
            rc = new UUIDNamedObjectGXT((UUIDNamedObjectDMO)obj);
            break;
        case UnnamedObjHSID:
            rc = new UnnamedObjHSGXT((UnnamedObjHSDMO)obj);
            break;
        case UnnamedObjMVID:
            rc = new UnnamedObjMVGXT((UnnamedObjMVDMO)obj);
            break;
        case UnnamedObjMVIDXID:
            rc = new UnnamedObjMVIDXGXT((UnnamedObjMVIDXDMO)obj);
            break;
        case UnnamedObjSVID:
            rc = new UnnamedObjSVGXT((UnnamedObjSVDMO)obj);
            break;
        case UnnamedObjTSID:
            rc = new UnnamedObjTSGXT((UnnamedObjTSDMO)obj);
            break;
        case UsingIndexedAttributesID:
            rc = new UsingIndexedAttributesGXT((UsingIndexedAttributesDMO)obj);
            break;
        case UsingObjRefHMID:
            rc = new UsingObjRefHMGXT((UsingObjRefHMDMO)obj);
            break;
        }

        return(rc);
    }

}

