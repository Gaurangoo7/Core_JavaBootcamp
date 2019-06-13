
package com.stegno.ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String args[]) {
		// Create ArrayList of String
		List<String> al = new ArrayList<String>();
		al.add("Shivani"); // Add objects to arraylist
		al.add("Himani");
		al.add("Bhushan");
		al.add("DIpak");
		al.add("Falguni");
		al.add("Kiran");

		// displaying elements
		System.out.println(al);

		// check duplicate element allowed or not ?
		al.add("Falguni");
		System.out.println(al);
		// Add element at particular index of ArrayList
		al.add(3, "Gaurang");

		// displaying elements after adding
		System.out.println(al);

		/// Removing "DIpak" and "Shivani"
		al.remove("Shivani");
		al.remove("DIpak");
		// al.remove(2);

		System.out.println("ArrayList after Delete operation: Using iterator() ");

		//Swapping 2nd(index 1) element with the 5th(index 4) element
	    Collections.swap(al, 1, 4);
	    System.out.println(al);
		/*// Traversing list through Iterator using while
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
	}
}
