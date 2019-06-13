package com.stegno.AccessModifiers;

class HelloWorld {
	
	public int a = 20;
	public void show() {
		System.out.println("Hello World");
	}
}
public class PrivateDemo {
	public static void main (String [] args) {
		HelloWorld obj = new HelloWorld();
		System.out.println(obj.a);
		obj.show();
		
	}

}
