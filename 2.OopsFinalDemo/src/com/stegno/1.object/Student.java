package com.stegno.object;
  
class Student {
	// defining fields
	int id;         // field or data member or instance variable
	String name;
	public static void main(String args[]) {

		// Creating an object or instance
		Student stu = new Student();// creating an object of Student
		// Printing values of the object
		System.out.println("Student Roll No is " +stu.id+  " Student name is " +stu.name);// accessing member through reference variable (id & name)
		
	}
}