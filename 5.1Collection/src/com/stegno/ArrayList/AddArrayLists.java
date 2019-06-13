//Add all the elements of an arraylist to another arraylist by using addAll() method.
package com.stegno.ArrayList;

import java.util.ArrayList;

public class AddArrayLists {

	public static void main(String[] args) {
		// ArrayList1 of String type
		ArrayList<String> al = new ArrayList<String>();
		al.add("Dhule");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Goa");
		System.out.println("ArrayList1 before addAll:" + al);

		// ArrayList2 of String Type
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Nashik");
		al2.add("Dhule");
		al2.add("Goa");

		// Adding ArrayList1 into ArrayList2 - addAll()
		al2.addAll(al);
		System.out.println("ArrayList1 after addAll:" + al2);
	}
}
