//Static variable demo
package com.stegno.VariableDemo;

public class StaticVarDemo {
	// declear static variable
	public static String myClassVar = "class or static variable";

	public static void main(String args[]) {
		StaticVarDemo obj = new StaticVarDemo();
		StaticVarDemo obj2 = new StaticVarDemo();
		StaticVarDemo obj3 = new StaticVarDemo();

		// All three will display "class or static variable"
		System.out.println(obj.myClassVar); //
		System.out.println(obj2.myClassVar);//
		System.out.println(obj3.myClassVar);//

		// changing the value of static variable using obj2
		obj2.myClassVar = "Changed Text";

		// All three will display "Changed Text"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
	}

}
