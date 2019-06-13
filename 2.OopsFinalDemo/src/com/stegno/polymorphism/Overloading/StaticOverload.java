package com.stegno.polymorphism.Overloading;

//filename StaticOverload.java 
public class StaticOverload { 
	public static void foo() { 
		System.out.println("StaticOverload.foo() called "); 
	} 
	public static void foo(int a) { 
		System.out.println("StaticOverload.foo(int) called "); 
	} 
	public static void main(String args[]) 
	{ 
		StaticOverload.foo(); 
		StaticOverload.foo(10); 
	} 
} 

