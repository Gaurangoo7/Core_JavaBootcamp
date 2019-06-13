//Multilevel Inheritance
package com.stegno.Inheritance;

class X {
	public void methodX() {
		System.out.println("Class X method : SuperClass");
	}
}

class Y extends X {
	public void methodY() {
		System.out.println("class Y method : Y is Child of X");
	}
}

class Z extends Y {
	public void methodZ() {
		System.out.println("class Z method : Z is Child of Y");
	}

	public static void main(String args[]) {
		Z obj = new Z();
		obj.methodX(); // calling grand parent class method
		obj.methodY(); // calling parent class method
		obj.methodZ(); // calling local method
	}
}
