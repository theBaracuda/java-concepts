package com.others;

public class InitializerBlockDemo {
	
	//initializer block
	{
		System.out.println("Initializer Block!");
	}
	
	public InitializerBlockDemo() {
		System.out.println("Default Constructor!");
	}
	
	public InitializerBlockDemo(int a) {
		System.out.println("Parameterized Constructor!");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//To illustrate the use of an initializer block
		//initializer block contains code which is executed
		//every time an instance is created
		//executed before the constructor
		InitializerBlockDemo a = new InitializerBlockDemo();
		InitializerBlockDemo b = new InitializerBlockDemo(10);
	}

}
