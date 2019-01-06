package com.generic;

public class GenericMethodDemo {
	//generic method printArray
	//<T> indicates parameter type
	//it can contain one or more type parameters separated by comma
	public static <T> void printArray(T[] inputArray) {
		//displaying array elements
		for(T element: inputArray)
			System.out.print(element+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		//To illustrate the use of generic methods
		//parameter types can represent only reference types
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		String[] stringArray = {"S","T","R","I","N","G"};
		Character[] charArray = {'C','H','A','R','A','C','T','E','R'};
		System.out.println("Integer Array: ");
		printArray(intArray);
		System.out.println("Double Array: ");
		printArray(doubleArray);
		System.out.println("String Array: ");
		printArray(stringArray);
		System.out.println("Character Array: ");
		printArray(charArray);
	}

}