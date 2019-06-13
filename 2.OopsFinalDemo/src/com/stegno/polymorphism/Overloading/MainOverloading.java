//Main method overloading
package com.stegno.polymorphism.Overloading;

class MainOverloading {
	public static void main(String[] args) {
		System.out.println("main with String[]");
	}

	public static void main(String args) {
		System.out.println("main with String");
	}

	public static void main() {
		System.out.println("main without args");
	}
}