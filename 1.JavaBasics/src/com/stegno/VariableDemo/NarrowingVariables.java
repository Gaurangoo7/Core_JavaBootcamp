//Java Narrowing 

package com.stegno.VariableDemo;

public class NarrowingVariables {

	public static void main(String[] args) {
		float f = 10.5f;
		System.out.println(f); // 10.5
		// int a=f;//Compile time error
		int a = (int) f;
		System.out.println(a);
	}
}
