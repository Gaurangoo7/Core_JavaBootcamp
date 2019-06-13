//Creating a HashMap and Adding key-value pairs to it

package com.stegno.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		// Creating a HashMap
		Map<String, Integer> hm = new HashMap<>();
		// Check if hashmap is empty or not ?
		 System.out.println(hm.isEmpty());

		// Adding key-value pairs to a HashMap
		hm.put("Rohit", 1);
		hm.put("Shivani", 2);
		hm.put("Falguni", 3);
		System.out.println(hm);

		// Add a new key-value pair only if the key does not exist in the
		// HashMap, or is mapped to `null`
		hm.putIfAbsent("Gaurang", 4);

		System.out.println(hm);

		// Find the size of a HashMap
		System.out.println(hm.size());
		
		//remove 
		hm.remove("Gaurang");
		System.out.println(hm);
		
		hm.remove("Shivani", 2);
		System.out.println(hm);
		
		
		
	}
}