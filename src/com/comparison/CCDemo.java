package com.comparison;
import java.util.ArrayList;
import java.util.Collections;

public class CCDemo implements Comparable<CCDemo>{
	private int ccID;
	private String ccName;
	
	CCDemo(int ccID, String ccName){
		this.ccID=ccID;
		this.ccName=ccName;
	}
	
	public int getCcID() {
		return ccID;
	}

	public void setCcID(int ccID) {
		this.ccID = ccID;
	}

	public String getCcName() {
		return ccName;
	}

	public void setCcName(String ccName) {
		this.ccName = ccName;
	}

	@Override
	public int compareTo(CCDemo ccDemo) {
		//To sort on the basis of ccID
		//return this.ccID-ccDemo.ccID;
		if(this.ccID>ccDemo.ccID)
			return 1;
		else if(this.ccID<ccDemo.ccID)
				return -1;
		return 0;
	}

	public static void main(String[] args) {
		//To illustrate the use of Comparable and Comparator
		ArrayList <CCDemo>array = new ArrayList<CCDemo>();
		array.add(new CCDemo(25,"one"));
		array.add(new CCDemo(15,"two"));
		array.add(new CCDemo(45,"three"));
		array.add(new CCDemo(55,"four"));
		array.add(new CCDemo(35,"five"));
		System.out.println("Original List:");
		for(CCDemo ccDemo : array)
			System.out.print(ccDemo.ccID+" "+ccDemo.ccName+"\n");
		Collections.sort(array);
		System.out.println("ID Sorted List:");
		for(CCDemo ccDemo : array)
			System.out.print(ccDemo.ccID+" "+ccDemo.ccName+"\n");
		Collections.sort(array, new CCNameCompare());
		System.out.println("Name Sorted List:");
		for(CCDemo ccDemo : array)
			System.out.print(ccDemo.ccID+" "+ccDemo.ccName+"\n");
	}

}
