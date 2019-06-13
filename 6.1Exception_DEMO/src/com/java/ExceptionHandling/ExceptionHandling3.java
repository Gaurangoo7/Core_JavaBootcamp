//nested try
package com.stegno.ExceptionHandling;

public class ExceptionHandling3 {
	public static void main(String[] args) {

		try {

			try {

				System.out.println("Inside block 1");
				int b = 76 / 0;
				System.out.println(b);
			} catch (ArithmeticException e) {
				System.out.println("Exception 1" + e);
			}
			try {
				System.out.println("Inside block 2");
				int b = 45 / 0; 
				System.out.println(b);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception 2" + e2);
			} catch (ArithmeticException e3) {
				System.out.println("Exception 2" + e3);
			}
		} finally {
			System.out.println("I am out of all methods");
		}
	}
}
