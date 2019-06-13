//Exception handling using multiple cathch 
package com.stegno.ExceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;// exception
			System.out.println("What will happen here ?"); // throw exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Exception Occour ");
		} catch (Exception e) {
			System.out.println("Parent class of All exceptions " + e.getCause());
		}
		System.out.println("End of programme");
	}

}
