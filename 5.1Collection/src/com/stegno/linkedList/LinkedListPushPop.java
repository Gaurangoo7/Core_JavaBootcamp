package com.stegno.linkedList;

import java.util.LinkedList;

public class LinkedListPushPop {
	public static void main(String[] args) {

		// Create a LinkedList of Strings
		LinkedList<String> list = new LinkedList<String>();

		// Add few Elements
		list.add("Swapnil");
		list.add("Sumit");
		list.add("Pankaj");
		list.add("Ashwini");

		// Display LinkList elements
		System.out.println("LinkedList contains: " + list);

		// push Element the list - Inserts the element at the front of the list
		list.push("NEW ELEMENT");
		System.out.println("LinkedList contains after push: " + list);
		// pop element the list
		list.pop(); // Removes and returns the first element of the list.

		// Display after pop operation
		System.out.println("LinkedList contains after pop : " + list);
	}
}

