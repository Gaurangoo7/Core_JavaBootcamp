//Hierarchical
package com.stegno.Inheritance;

class One {
	public void methodA() {
		System.out.println("method of Class A");
	}
}

class Two extends One {
	public void methodB() {
		System.out.println("method of Class B");
	}
}

class Three extends One {
	public void methodC() {
		System.out.println("method of Class C");
	}
}

class Four extends One {
	public void methodD() {
		System.out.println("method of Class D");
	}
}

class Hierarchical {
	public static void main(String args[]) {
		Two obj1 = new Two();
		Three obj2 = new Three();
		Four obj3 = new Four();
		// All classes can access the method of class A
		obj1.methodA();
		obj2.methodA();
		obj3.methodA();
	}
}
