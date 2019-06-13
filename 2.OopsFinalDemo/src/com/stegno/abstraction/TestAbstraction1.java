//An abstract class without any abstract method 

package com.stegno.abstraction;

abstract class Parent { 
	void fun() { System.out.println("Base fun() called"); } 
} 

class Child extends Parent { } 

class TestAbstraction1 { 
	public static void main(String args[]) { 
		Child ch = new Child(); 
		ch.fun(); 
	} 
} 

