package com.java.oops.polymorphism;
//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
//Method Overloading: BY changing no. of arguments
class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int x, int y, int z) {    //Parameters with different name
		return x + y + z;
	}
	

	static double add(double a, double b, double c) {   // Changing data type
		return a + b + c;
	}
}

class TestOverloading {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));

		System.out.println(Adder.add(11.1, 12.2, 13.3));
	}
}