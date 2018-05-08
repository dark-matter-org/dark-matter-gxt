package org.dmd.mvw.client.gxtforms.implementation;

/**
 * The GxtEnumValue is a helper class that's used to represent values associated
 * with Dark Matter Schema Enum Definitions. This is required since ComboBoxes are
 * populated using a ListStore which takes a BaseModel derived class.
 * <p />
 * Instance of GxtEnumValues are generated from GxtEnumMapping declarations in
 * Model View Whatever (MVW).
 */
public class GxtEnumValue implements Comparable<GxtEnumValue>{
	
	// The enum value as an uppercase string
	private String	enumValue;
	
	// The numeric value
	private int		numericValue;
	
	// A string that places this value in a particular lexicographic order
	private String	sortOrder;
	
	// The label displayed to represent this value
	private String	label;
	
	public GxtEnumValue(String enumValue, Integer nv, String sortOrder, String label){
		this.enumValue = enumValue;
		this.numericValue = nv;
		this.sortOrder = sortOrder;
		this.label = label;
	}

	public String getEnumValue(){
		return(enumValue);
	}
	
	public int getNumericValue(){
		return(numericValue);
	}
	
	public String getSortOrder(){
		return(sortOrder);
	}
	
	public String getLabel(){
		return(label);
	}
	
	public String toString(){
		return(getEnumValue() + " - " + numericValue + " - " + getSortOrder() + " - " + getLabel());
	}

	@Override
	public int compareTo(GxtEnumValue o) {
		return(sortOrder.compareTo(o.sortOrder));
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof GxtEnumValue) {
			GxtEnumValue other = (GxtEnumValue) obj;
			
			if ( (enumValue == other.enumValue) && (numericValue == other.numericValue))
				return(true);
		}
		return(false);
	}
	
	
}
