package com.generic;

public class BTPDemo {
   //determines the largest of three Comparable objects
   //type parameters name is followed by extends/implements keyword
   //which is in turn followed by the types upper bound
   public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
      T max=x; 
      if(y.compareTo(max)>0)
         max=y;
      if(z.compareTo(max)>0)
         max=z;    
      return max;
   }
   
   public static void main(String args[]) {
	  //To illustrate the use of bounded type parameters
	  //this is used to restrict the kinds of types that
	  //are allowed to be passed to a type parameter
	  System.out.print("Maximum(10,20,30): ");
      System.out.println(findMax(3,4,5));
	  System.out.print("Maximum(7.8,2.4,8.6): ");
      System.out.println(findMax(7.8,2.4,8.6));
	  System.out.print("Maximum(pear,apple,orange): ");
      System.out.println(findMax("pear","apple","orange"));
   }
}