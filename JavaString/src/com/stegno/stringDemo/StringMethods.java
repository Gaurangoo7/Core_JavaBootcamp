package com.stegno.stringDemo;

public class StringMethods {
	public static void main(String[] args) {
		// Declear string variables & initialise values
		String str1 = "StegnoCloud";
		String str2 = "Java";
		String name = "StegnoCloud";
		// Concat()
		String str3 = str1.concat(str2);
		System.out.println(str3);

		// Concat using '+' operator
		String str4 = str1 + str2;
		System.out.println("The concat string is  :" + str1 + "" + str2);
		System.out.println(str4);

		// Length of string - length()
		System.out.println("Length of string1 " + str1.length());
		System.out.println("Length of string4 " + str4.length());
		

		// Lowecase & upperCase
		System.out.println("Convert to lowercase :" + str1.toLowerCase());

		System.out.println("Convert to Uppercase :" + str4.toUpperCase());

		// To find character at some position --> charAt()
		System.out.println("Character at 6th position : " + str4.charAt(6));

		// To find position of character --> indexOf()
		System.out.println("Character at ? position : " + str4.indexOf('o'));

		// To comapre 2 strings comapre()
		System.out.println("Comapre to 'STEGNOCLOUD' : " + str1.compareTo(name));
		System.out.println("Comapre to 'java' : " + str1.compareTo(str2));
		System.out.println("Comapre to 'STEGNOCLOUDJava' : " + str1.compareTo(str4));

		System.out.println("Comapre to 'STEGNOCLOUD' : " + str1.compareToIgnoreCase(name));

		// contains() --> to find weather the string contains the word or not ?
		str4.contains("Java");

		//endsWith() --> 
		str4.endsWith("A");
		
		//replace() --> REPLACE / REPLACEALL/REPLACEFIRST
		System.out.println("Replace 'Cloud' with 'Loud' : " +str4.replace("Cloud", "Loud"));
		
		//trim() --> 
		String stu = "My Students are BEST";
		String stu2 = stu.trim();
		System.out.println(stu); // MyStudentsareBEST
		

	}

}
