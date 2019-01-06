package com.generic;

public class GenericClassDemo<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
	  //To illustrate the use of generic classes
      GenericClassDemo<Integer> integerBox = new GenericClassDemo<Integer>();
      GenericClassDemo<String> stringBox = new GenericClassDemo<String>();
      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));
      System.out.println("Integer Value: "+integerBox.get());
      System.out.println("String Value: "+stringBox.get());
   }
}