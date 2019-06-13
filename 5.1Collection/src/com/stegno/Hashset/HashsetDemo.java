package com.stegno.Hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {

		// Hashset declearatrion
		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		// Adding elements to hashset
		hs.add("Rohit");
		hs.add("Leena");
		hs.add("Prerna");
		hs.add("Falguni");
		hs.add("Shivani");
		// Adding duplicate
		hs.add("Rohit");
		System.out.println("The Set elemets are " + hs);
	//Adding null value
		hs.add(null);
		hs.add(null);
		System.out.println("The Set elemets after adding null are " + hs);
		
		//Remove 
		hs.remove("Rohit");
		System.out.println("The Set elemets after removing element " + hs.size());
		
		//delete all elements of set
		hs.clear();
		System.out.println("The elements in hashset are" +hs);

		LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
		hs1.add("Himani");
		hs1.add("Rishi");

		hs1.add("Aadi");
		
		hs1.addAll(hs);
		System.out.println(hs);
		

	}

}
