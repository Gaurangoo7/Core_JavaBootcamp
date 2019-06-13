//Initialization of object through method
package com.stegno.object;

class Student2 {
	int rollno;
	String name;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}

class TestStudent2 {
	public static void main(String args[]) {
		Student2 obj1 = new Student2();
		Student2 obj2 = new Student2();
		obj1.insertRecord(198, "Bhushan");
		obj2.insertRecord(232, "Akshay");
		obj1.displayInformation();
		obj2.displayInformation();
	}
}