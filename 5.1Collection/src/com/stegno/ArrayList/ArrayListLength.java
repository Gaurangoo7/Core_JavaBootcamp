//Find size of Arraylist
package com.stegno.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLength {

	public static void main(String args[]) {
		// Create ArrayList of Integers
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Initial size: " + al.size());  // 0
		al.add(121); // Add objects to arraylist
		al.add(45);
		al.add(78);
		al.add(34);
		al.add(55);
		// displaying elements
		System.out.println(al);   
		System.out.println("After adding objects size: " + al.size()); // Size
																		// of
																		// ArrayList
		al.remove(2);
		System.out.println("ArrayList after Delete operation:" + al.size()); 
		// Add element at particular index of ArrayList
		al.add(2, 87);
		System.out.println("Final ArrayList: ");
		for (int num : al) {
			System.out.println(num); 
		}
		/*
		 * // Sorting Int arrayList Collections.sort(al); //using sort()
		 * System.out.println(al); // Sorting in decreasing order
		 * Collections.sort(arraylist, Collections.reverseOrder()); //Using
		 * reverseOrder() System.out.println(al);
		 * 
		 */

	}

}
