// Static overloading is possible --> Yes
package com.java.oops.polymorphism;

	public class StaticOverload {
		//Static method 1
	    public static void m1() {   
	        System.out.println("Method 1  called ");
	    }
	  //Static method 2
	    public static void m1(int a) { 
	        System.out.println("Method 1(int) called ");
	    }
	    public static void main(String args[])
	    { 
	    	StaticOverload.m1();
	    	StaticOverload.m1(10);
	    }
	}
