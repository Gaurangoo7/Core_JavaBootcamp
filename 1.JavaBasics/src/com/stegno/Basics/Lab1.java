/*Variable & C0nstant demo*/
package com.stegno.Basics;

public class Lab1 {

	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean b1;

	void show1() {
		System.out.println("Variable & C0nstant demo");
		System.out.println(b);
		System.out.println(d);
		System.out.println(s);
		System.out.println(ch);
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(b1);

		System.out.println(f);

	}

	void show2() {

		System.out.println("Integer Litral Demo");
		int a = 12;
		int b = 10;
		int c = 0x12a; // integer litral demo
		byte d = 012;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	void show3() {
		System.out.println("Floating Point litral Demo");
		float f1 = 99.97f;
		double d1 = 9.9e-9;
		double d2 = 9.9E+9;
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(d2);
	}

	void show4() {
		System.out.println("Char litral Demo");
		char ch1 = 'A';
		int x1 = 'A';
		System.out.println(ch1);
		System.out.println(x1);
	}

	void show5() {
		System.out.println("Boolean litral Demo");
		boolean b1 = false;
		boolean b2 = true;
		System.out.println(b1);
		System.out.println(b2);
	}

	void show6() {
		System.out.println("String litral Demo");
		String s1 = "";
		String s2 = "123abc+";
		String s3 = "1";
		System.out.println("s1" + s1);
		System.out.println(s1.length());
		System.out.println("s2" + s2);
		System.out.println(s2.length());
		System.out.println("s3" + s3);
		System.out.println(s3.length());
		System.out.println("String litral Demo");
	}
}
