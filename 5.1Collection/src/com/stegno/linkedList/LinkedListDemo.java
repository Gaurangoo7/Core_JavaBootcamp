package com.stegno.linkedList;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedListDemo {
	public static void main(String args[]) {
		// Create ArrayList of String
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println("Initial size of elements: " + ll.size()); // 0
		ll.add("Shivani"); // Add objects to arraylist
		ll.add("Himani");
		ll.add("Bhushan");
		ll.add("DIpak");
		ll.add("Falguni");
		ll.add("Kiran");

		// displaying elements
		System.out.println(ll); // [Shivani, Him,Bhushan,Dipak,Fal,Kiran]
		System.out.println("after adding size of elements: " + ll.size());  //6

		// check duplicate element allowed or not ?
		ll.add("DIpak"); 
		System.out.println(ll);  //
		// Add element at particular index of ArrayList
		// Adding "Gaurang" at the fourth position
		ll.add(3, "Gaurang");

	       /*Add First and Last Element*/
	       ll.addFirst("First Item");
	       ll.addLast("Last Item");
	       System.out.println("LinkedList Content after addition: " +ll);
	       


		// displaying elements after adding
		System.out.println(ll);

		/// Removing "DIpak" and "Shivani"
		ll.remove("Shivani");
		ll.remove("DIpak");
		ll.remove(2);

		System.out.println("ArrayList after Delete operation: Using iterator() ");

		// Traversing list through Iterator using while
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
			  /*Remove first and last element*/
		       ll.removeFirst();
		       ll.removeLast();
		       System.out.println("LinkedList after deletion of first and last element: " +ll);

		}

	}

