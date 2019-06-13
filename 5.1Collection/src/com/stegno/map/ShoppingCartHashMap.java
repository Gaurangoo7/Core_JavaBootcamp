package com.stegno.map;

import java.util.HashMap;
import java.util.Set;

public class ShoppingCartHashMap {

	public static void main(String a[]) {

		HashMap<String, Double> shoppingItems = new HashMap<String, Double>();

		// add Shooping Items to Shopping cart

		shoppingItems.put("RayBan Sunglasses", 4500.50);
		shoppingItems.put("LeeCooper Jeans", 2499.30);
		shoppingItems.put("LakMe Kajol", 180.00);
		shoppingItems.put("TeddyBear", 1300.00);
		System.out.println("\n" + shoppingItems);

		// getting value for the given key from hashmap --> Using get method

		System.out.println("\nPrice of TeddyBear: " + shoppingItems.get("TeddyBear")); 
		System.out.println("\nPrice of Bracelet: " + shoppingItems.get("Bracelet")); // What
																						// will
																						// be
																						// output?
		System.out.println("\nIs HashMap empty? " + shoppingItems.isEmpty());

		shoppingItems.remove("LakMe Kajol");

		System.out.println("\n" + shoppingItems);
		System.out.println("\nSize of the HashMap: " + shoppingItems.size());

		// Iterating through HashMap Items

		System.out.println("\nReterive Each Items Names from our Grocery List of Items \n");

		Set<String> shoppingItemNames = shoppingItems.keySet(); // Converting to
																// Set so that
																// we can
																// traverse
		for (String eachItem : shoppingItemNames) {

			System.out.println(eachItem);


		}
	}
}