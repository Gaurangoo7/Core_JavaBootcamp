//method overloading - based on the changing of the sequence of the data type of parameters.
package com.stegno.polymorphism.Overloading;

public class Multiplication {
	void multiply(int a, double b) {
		double m1 = a * b;
		System.out.println("Multiplication of two numbers: " + m1);

	}
// We changed the order of data type in parameters
	void multiply(double a, int b) {
		double m2 = a * b;
		System.out.println("Multiplication of two numbers: " + m2);
	}

	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		//This will call first multiply method 
		m.multiply(10, 20.5); 
		////This will call Second multiply method 
		m.multiply(10.5, 30);
	}
}
