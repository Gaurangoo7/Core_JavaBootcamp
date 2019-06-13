//converts a List to a Set (ArrayList --> HashSet)
package com.java.StegnoCloud;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conversion2 {

	public static void main(String[] args) {
		List myList = new ArrayList();
		myList.add("Hello");
		myList.add("Students");
		myList.add("Students");
		Set set = new HashSet(myList);

		System.out.println(set);
	}

}