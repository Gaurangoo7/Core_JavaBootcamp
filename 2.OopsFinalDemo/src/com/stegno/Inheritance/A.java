//Single Inheriatance 
package com.stegno.inheritance;

public class A {

	public void m1() {
		System.out.println("I am Parent");
	}
}

class B extends A {

	public void m2() {
		System.out.println("I am Child cla1ss");
	}

	public static void main(String[] args) {
		B obj = new B();
		obj.m1();
		obj.m2();

	}
}
