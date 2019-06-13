package com.stegno.stringDemo;

public class ImutablestringDemo {

	public static void main(String[] args) {

		String s = "Ranbir";
		s.concat(" Kapoor");// concat() method appends the string at the end
		System.out.println(s);// will print Ranbir because strings are immutable objects
		
		//But if we assign it to reference variable then it will refer to object
		s=s.concat(" Singh");  
		   System.out.println(s);  					

	}

}
