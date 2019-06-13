package com.stegno.linkedList;

import java.util.LinkedList;

public class LinkedListLength {
	
	public static void main(String args[]) {
		// Create ArrayList of Integers
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println("Initial size: " + ll.size());
		ll.add(121); // Add objects to arraylist
		ll.add(45);
		ll.add(78);
		ll.add(34);
		ll.add(55);
		// displaying elements
		System.out.println(ll);
		System.out.println("After adding objects size: " + ll.size()); // Size
																		// of
																		// ArrayList
		ll.remove(2);
		System.out.println("ArrayList after Delete operation:" + ll.size());
		// Add element at particular index of ArrayList
		ll.add(2, 87);
		System.out.println("Final ArrayList: ");
		for (int num : ll) {
			System.out.println(num);
		}
		/*
		 * // Sorting Int arrayList Collections.sort(al); //using sort()
		 * System.out.println(ll); // Sorting in decreasing order
		 * Collections.sort(arraylist, Collections.reverseOrder()); //Using
		 * reverseOrder() System.out.println(ll);
		 * 
		 */

	}


}
