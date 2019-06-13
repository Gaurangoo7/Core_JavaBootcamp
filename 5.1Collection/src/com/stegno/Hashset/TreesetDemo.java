package com.stegno.Hashset;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// Hashset declearatrion
		TreeSet<String> hs = new TreeSet<String>();

		// Adding elements to hashset
		hs.add("Rohit");
		hs.add("Leena");
		hs.add("Prerna");
		hs.add("Falguni");
		hs.add("Shivani");
		// Adding duplicate
		hs.add("Rohit");
		System.out.println("The Set elemets are " + hs); 
		
		  
		TreeSet<Integer> hs1 = new TreeSet<Integer>();
		hs1.add(1);
		hs1.add(7);	
		hs1.add(2);
		hs1.add(38);
		System.out.println("The Set elemets are " + hs1); 
		
	}

}
