package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.dmc.DmcObjectName;

import com.extjs.gxt.ui.client.data.BaseModel;

/**
 * The GxtObjectReference is used to associate a DmcObjectName with a user friendly
 * label. In many cases, the name by which objects are identified is not the name
 * that is presented to the user, so, when constructing GxtObjectReferences, it is
 * up to the designer to populate this information properly. For example, cards
 * in node may have DmcObjectNames that have a reasonable presentation string format,
 * but things like config profiles are usually identified by UUIDs and have a 
 * separate, user set, profile name. 
 * <p/>
 * The GxtObjectRefComboBox presents the user label when displayed.
 */
@SuppressWarnings("serial")
public class GxtObjectReference extends BaseModel {
//public class GxtObjectReference extends BaseModel implements Comparable<GxtObjectReference> {
	
//	static final DmcObjectName unsetName = new UUIDMoName(0,0);
	
	DmcObjectName	objName;

	public GxtObjectReference(DmcObjectName on, String ul, String so){
		objName = on;
		setUserLabel(ul);
		setSortOrder(so);
	}
	
	/**
	 * Constructs a new fake object reference to represent the unset value.
	 * @param n
	 */
	public GxtObjectReference(String ul){
		objName = null;
		setUserLabel(ul);
		setSortOrder("");
	}
	
	public boolean isUnset(){
		if (objName == null)
			return(true);
		return(false);
	}
	
	public DmcObjectName getObjectName(){
		return(objName);
	}
	
	public void setUserLabel(String n){
		set("userLabel",n);
	}
	
	public String getUserLabel(){
		return(get("userLabel"));
	}
	
	public void setSortOrder(String n){
		set("sortOrder",n);
	}
	
	public String getSortOrder(){
		return(get("sortOrder"));
	}
	
//	@Override
//    public int hashCode()
//    {
//		if (objName == null)
//	        return (unsetName.hashCode());
//		
//        return (objName.hashCode());
//    }
//	
//    @Override
//    public boolean equals(Object obj)
//    {
//    	if (objName == null)
//        	return(unsetName.equals(obj));
//    	
//    	return(objName.equals(obj));
//    }
//    
//    @Override
//    public int compareTo(GxtObjectReference o)
//    {
//    	if (objName == null)
//    		return(-1);
//    	
//    	return(objName.getNameString().compareTo(o.objName.getNameString()));
//    }    
}
