//\\//Abstrct class containing abstract method
package com.stegno.abstraction;

abstract class Car {
	abstract void run();
}

/*
 * In real scenario, implementation is provided by others i.e. unknown to end
 * user like in this case implimentation of abstract class/method is provided by
 * BMW
 */
class Bmw extends Car {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
		Car obj = new Bmw();
		obj.run();
	}
}