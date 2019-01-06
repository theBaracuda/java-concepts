package com.nested;

public class NestedClassOne {
	static private int a = 10;
	@SuppressWarnings("unused")
	static private String b = "This is a string"; 
	
	public void Display() {
		System.out.println("This is a test");
	}
	
	public class NestedClass{
		
		public void Demo() {
			System.out.println(a);
		}
		
	}
	
}
