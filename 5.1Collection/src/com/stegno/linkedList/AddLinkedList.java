package com.stegno.linkedList;

import java.util.LinkedList;

public class AddLinkedList {

	public static void main(String[] args) {
		// LinkedList of String type
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Dhule");
		ll.add("Pune");
		ll.add("Mumbai");
		ll.add("Goa");
		System.out.println("ArrayList1 before addlll:" + ll);

		// ArrayList2 of String Type
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Nashik");
		ll2.add("Dhule");
		ll2.add("Goa");

		// Adding ArrayList2 into ArrayList1
		ll.addAll(ll2);
		System.out.println("ArrayList1 after addAll:" + ll);
	}

}
