package examplesonbasic;

class Student4 {
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

class TestStudent4 {
	public static void main(String args[]) {
		Student4 s1 = new Student4();
		Student4 s2 = new Student4();
		s1.insertRecord(111, "Himani"); // Initialization through method
		s2.insertRecord(222, "Shivani"); // Initialization through method
		s1.displayInformation();
		s2.displayInformation();
	}
}