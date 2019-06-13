//Java program to demonstrate primitive data types in Java 
// If you put value of any data type more than its range it will give error
package com.stegno.Basics;

public class PremitiveDataTypes {

	public static void main(String args[]) {
		// Integer data type is generally used for numeric values
		int i = 125;
		System.out.println("Value of integer: " + i);

		// use byte and short if memory is a constraint
		byte b = 127;
		System.out.println("Value of byte: " + b);

		short s = 56;
		System.out.println("Value of short: " + s);

		// by default fraction value is double in java
		double d = 4.355453532;
		System.out.println("Value of  double: " + d);

		// for float use 'f' as suffix
		float f = 4.7333434f;
		System.out.println("Value of float: " + f);

		// declaring character
		char a = 'G';
		System.out.println("Value of char: " + a);
		// Change value of developer to false and see what will execute
		boolean developer = true;
		if (developer == true)
			System.out.println("Hi Guys you are Java Developer");
		else
			System.out.println("If developer==False then you are not developer");
	}

}
