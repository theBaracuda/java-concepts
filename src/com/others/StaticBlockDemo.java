package com.others;

public class StaticBlockDemo {
	static int a;
	
	//static block
	static {
		a=10;
		System.out.println("Static Block!");
	}
	
	public StaticBlockDemo() {
		System.out.println("Default Constructor!");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//To illustrate the use of a static block
		//used for static initializations of a class
		//it is executed only once when
		//either an object is created for the first time
		//or a static member is accessed for the first time
		//executed before the constructors
		System.out.println(StaticBlockDemo.a);
		StaticBlockDemo one = new StaticBlockDemo();
		StaticBlockDemo two = new StaticBlockDemo();
	}

}
