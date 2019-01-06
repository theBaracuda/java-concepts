package com.nested;

public class NestedClassTwo extends NestedClassOne{

	public static void main(String[] args) {
		//To understand the working of a nested class
		NestedClassOne nestedClassOne = new NestedClassOne();
		NestedClassOne.NestedClass nestedClass = nestedClassOne.new NestedClass();
		nestedClass.Demo();
	}

}
