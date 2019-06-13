// instance of an abstract class cannot be created, we can have references of abstract class type though.
package com.stegno.abstraction;

abstract class Base {
	abstract void fun();
}

class Derived extends Base {
	void fun() {
		System.out.println("Derived fun() called");
	}
}

class AbstractDemo {
	public static void main(String args[]) {

		// Base b = new Base(); //Creating instance of abstract class -->
		// Compile time error

		// We can have references of Base type.
		Base b = new Derived();
		b.fun();
	}
}
