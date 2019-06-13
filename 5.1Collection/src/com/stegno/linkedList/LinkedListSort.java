package com.stegno.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSort {
	public static void main(String args[]) {
		LinkedList<String> listofcountries = new LinkedList<String>();
		listofcountries.add("India");
		listofcountries.add("US");
		listofcountries.add("China");
		listofcountries.add("Denmark");

		/* Unsorted List */
		System.out.println("Before Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}

		/* Sort statement */
		Collections.sort(listofcountries);

		/* Sorted List */
		System.out.println("After Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}
		/*
		 * // Sorting in decreasing order Collections.sort(counter,
		 * Collections.reverseOrder()); //Using reverseOrder()
		 * System.out.println(counter);
		 */
	}

}
