// Java program to demonstrate 
// reference final variable
package com.java.FinalDemo;

class TestFinal {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// a final reference variable sb
		final StringBuilder sb = new StringBuilder("Ashwini");

		System.out.println(sb);

		// changing internal state of object
		// reference by final reference variable sb
		sb.append(" Gaurang Shah");

		System.out.println(sb);
	}
}
