package com.java.oops.polymorphism;
//Method Overloading: BY changing data type

class Adder1 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b, double c) {  // Changing data type
		return a + b + c;
	}
}

class TestOverloading1 {
	public static void main(String[] args) {
		System.out.println(Adder1.add(11, 11));
		System.out.println(Adder1.add(12.3, 12.6 ,11.8 ));	}
}