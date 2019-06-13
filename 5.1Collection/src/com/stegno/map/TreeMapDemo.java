package com.stegno.map;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main (String [] args) {
		//Create treeMap 
		TreeMap<String,String>	fileExt = 	new TreeMap<String,String>();
		
		fileExt.put("Java", ".java");

		fileExt.put("Python", ".py");

		fileExt.put("C++", ".cpp");

		fileExt.put("GoLang", ".go");

		fileExt.put("R prog", ".A");
		
		System.out.println(fileExt);
		
		//Sort values in decending order
		
		System.out.println(fileExt.descendingMap());
		
		
		
	}

}
