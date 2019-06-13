package com.java.oops.examples;

//How to Declare, Create and Initialize an Object in Java 
public class Student {
	private String name; // Encapsulation
	private String college;

	// Constructor
	public Student(String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}

	//getter & setter methods for encapsulation

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public static void main(String[] args) {
		// Declaration: The code Student student; declarations that associate a
		// variable name with an object type.
		// Instantiation: The new keyword is a Java operator that creates the
		// object.
		// Initialization: The new operator is followed by a call to a
		// constructor, which initializes the new object.
		Student student = new Student("Komal", "Mumbai");
		Student student2 = new Student("Rushi", "SSVPS");
		Student student3 = new Student("Dhanashri", "SVKM");
	}
}