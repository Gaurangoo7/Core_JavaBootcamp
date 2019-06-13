package com.stegno.VariableDemo;

//Instance Variable demo

public class InstanceVarDemo {
	String myInstanceVar = "Hi I aminstance variable";

	public static void main(String args[]) {
		InstanceVarDemo obj = new InstanceVarDemo();
		InstanceVarDemo obj2 = new InstanceVarDemo();
		InstanceVarDemo obj3 = new InstanceVarDemo();

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);

		obj2.myInstanceVar = "Changed Text";

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
	}
}
