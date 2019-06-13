//The super keyword is used for calling the parent class method/constructor.
package com.stegno.polymorphism.Overriding;

//base class
class Base {
	public void myMethod() {
		System.out.println("Overridden method");
	}
}

class SuperDemo extends Base {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method");
	}

	public static void main(String args[]) {
		SuperDemo obj = new SuperDemo(); 
		obj.myMethod();
	}
}