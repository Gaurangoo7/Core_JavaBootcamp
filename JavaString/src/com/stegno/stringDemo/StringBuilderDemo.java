package com.stegno.stringDemo;
import java.lang.String;

public class StringBuilderDemo {

	public static void main(String[] args) {
	//Create object of class StringBuffer
		StringBuilder sb = new StringBuilder("Java");
		
		//To concat we are using append()
		sb.append(":");
		sb.append("StegnoCloud");
		System.out.println(sb); 
		
		//insert() 
		sb.insert(3, "Lambo");
		System.out.println(sb);
		
		//replace() 
		sb.replace(1, 3, "Python");
		System.out.println(sb);
		//delete() 
		sb.delete(0,7);
		System.out.println(sb);
		
		//reverse() 
		sb.reverse();
		System.out.println(sb);
		
		//capacity() -
		System.out.println(sb.capacity());
		
		
		
	}

}
