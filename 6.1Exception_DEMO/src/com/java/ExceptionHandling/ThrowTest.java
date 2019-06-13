package com.stegno.ExceptionHandling;

public class ThrowTest {

	static void avg() {
		try {

			throw new ArithmeticException("Demo");
		} catch (ArithmeticException e) {
			System.out.println("Exception Caught");
		}
	}

	public static void main() {
         avg();
	}
}
