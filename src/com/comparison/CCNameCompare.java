package com.comparison;
import java.util.Comparator;

public class CCNameCompare implements Comparator<CCDemo>{

	@Override
	public int compare(CCDemo one, CCDemo two) {
		//To sort on the basis of ccName
		if((one.getCcName()).compareTo(two.getCcName())>0)
			return 1;
		else if(((one.getCcName()).compareTo(two.getCcName())<0))
				return -1;
		return 0;
	}

}
