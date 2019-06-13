//Parameterized Constructor
package com.stegno.constructor;

public class Student1 {
	// defining fields
	int id; // field or data member or instance variable
	String name;

	// Parameterized Constructor
	Student1(int id, String name) {

		// this can be used to refer current class instance variable.
		this.name = name;
		this.id = id;
		System.out.println("Hi I am Parameterised Constructor & I will Invoke once object is created");
	}

	public static void main(String[] args) {
		Student1 stud = new Student1(121, "Samanta");
		Student1 stud1 = new Student1(122, "Falguni");
		System.out.println("Candidate 1 roll Number & Name is: " + stud.id + " " + stud.name);
		System.out.println("Candidate 2 roll Number & Name is: " + stud1.id + " " + stud1.name);

	}

}
