package com.stegno.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// Create arrayList
		ArrayList<String> al = new ArrayList<String>();
		// size() to know size of List
		System.out.println("initial size" + al.size());
		// Adding objects - add()
		al.add("Prerna");
		al.add("Himani");
		al.add("Komal");
		al.add("Rohit");
		al.add("Varun");
		al.add("Yash");
		al.add("Rohit");
		al.add("Leena");
		System.out.println("Arraylist elements " + al);
		System.out.println("Arraylist elements size " + al.size());

		// Adding element at specific position 4th position
		al.add(3, "Gaurang");
		System.out.println(al);

		// Delete object from arraylist
		al.remove(2);
		System.out.println(al);

		// Transversing list through Iterattor
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
