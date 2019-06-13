//Default (no-arg constructor) Constructor Demo
package com.stegno.constructor;
  
class Student {
	// defining fields
	int id;         // field or data member or instance variable
	String name;
	
	/*Student(){
		// Once object is created it will call student() constructor to assign default values to data members (Variables)
		 System.out.println("Hi I am talented Java Developer");
	}*/
	public static void main(String args[]) {

		// Creating an object or instance
		Student stu = new Student();// creating an object of Student
		// Printing values of the object
		System.out.println("Student Roll No is " +stu.id+  " Student name is " +stu.name);// accessing member through reference variable (id & name)
		
	}
}