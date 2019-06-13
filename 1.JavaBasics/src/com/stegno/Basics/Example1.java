package com.stegno.Basics;

public class Example1 {
	int a;
	float b;
	String str;

	public void operation1() {
		a = 10;
		b = (float) 13.7;
		str = "Java";
	}

	public void operation2() {
		a = 17;
		b = (float) 17.7;
		str = "JavaScript";

	}

	public void display() {
		System.out.println("The integer value is :" + a);
		System.out.println("The Float value is :" + b);
		System.out.println("The String value is :" + str);
	}

	public class Mainclass {

		public void main(String[] args) {

			Example1 ex = new Example1();
			ex.operation1();
			ex.display();

		}
	}
}
