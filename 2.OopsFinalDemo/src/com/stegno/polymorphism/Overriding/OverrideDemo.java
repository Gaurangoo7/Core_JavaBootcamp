//Source code for Method Overriding
package com.stegno.polymorphism.Overriding;

public class OverrideDemo {
	public static void main(String[] args) {

		A a = new A();
		a.m1();
		a.m2();

		B b = new B();
		b.m1();
		b.m2();
		b.m3();

		A a1 = new B();
		a1.m1();
		a1.m2();
	}
}
