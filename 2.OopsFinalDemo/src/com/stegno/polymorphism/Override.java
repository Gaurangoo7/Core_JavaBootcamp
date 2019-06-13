//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in java.(Runtime polymorphism)
package com.java.oops.polymorphism;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

class Override {
	public static void main(String args[]) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
	}
}

/*
 * Rules for Java Method Overriding method must have same name as in the parent
 * class method must have same parameter as in the parent class. must be IS-A
 * relationship (inheritance).
 */