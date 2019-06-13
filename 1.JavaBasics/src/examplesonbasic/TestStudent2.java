package examplesonbasic;

class Student2 {
	int id;
	String name;
}

class TestStudent2 {
	public static void main(String args[]) {
		// Creating objects
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		// Initializing objects
		s1.id = 101;
		s1.name = "Swapnil";
		s2.id = 102;
		s2.name = "Mayur";
		// Printing data
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);
	}
}