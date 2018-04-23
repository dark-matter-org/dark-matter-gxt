package org.dmd.mvw.client.gxtforms.validators;

import java.util.ArrayList;
import java.util.List;

import org.dmd.dmc.types.CheapSplitter;

import com.google.gwt.editor.client.Editor;

/**
 * The IntegerListValidator validates a comma separated list of integers.
 * If constructed with a range, it will also check that the integers are
 * in the specified range.
 */
public class MACListValidator extends CommaSeparatedValuesValidator<String> {
	
	boolean range;
	Integer	start;
	Integer	end;
	
	public MACListValidator(){
		super();
		range = false;
	}

	public MACListValidator(Integer s, Integer e){
		super();
		range = true;
		if (s >= e)
			throw(new IllegalStateException("The start of the range must be less than the end of the range."));
		start 	= s;
		end 	= e;
	}

	@Override
	String typeCheck(String value) {
		String rc = value;
		
		ArrayList<String>	tuples = CheapSplitter.split(value, ':', false, true);
		if (tuples.size() != 6){
			lastError = "Incorrect number of tuples in MAC: " + value;
			rc = null;
		}
		else{
			for(String tuple: tuples){
				if (tuple.length() != 2){
					lastError = "Invalid tuple in MAC: " + tuple;
					rc = null;
					break;
				}
				else{
					if (!tuple.matches("[0-9a-f]*")){
						lastError = "Invalid tuple in MAC: " + tuple + " (use digits 0-9 and letters a-f)";
						rc = null;
						break;
					}
				}
			}
		}
		
		return(rc);
	}

	@Override
	public List validate(Editor editor, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
