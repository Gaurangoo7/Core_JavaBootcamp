package com.stegno.VariableDemo;

//Local variable demo

public class LocalVariableDemo {
	// instance variable - As its decleared outside method
	public String myVar = "Hi I am instance variable";

	public void myMethod() {
		// local variable as its decleared inside myMethod()
		String myVar = "I am Method Variable";
		System.out.println(myVar);
	}

	public static void main(String args[]) {
		// Creating object
		LocalVariableDemo obj = new LocalVariableDemo();
		obj.myMethod(); // We are calling method
		System.out.println(obj.myVar);
	}
}
