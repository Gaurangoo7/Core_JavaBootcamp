//initialize the object through a reference variable.
package com.stegno.object;

class Student1 {
	int id;
	String name;
}

class TestStudent1 {
	public static void main(String args[]) {
		// Create Object
		Student1 stud = new Student1();
		Student1 stu = new Student1();

		// Initialize Object
		stud.id = 32;
		stud.name = "Himani";
		stu.id = 33;
		stu.name = "Leena";

		System.out.println(stud.id + " " + stud.name);
		System.out.println(stu.id + " " + stu.name);
	}
}