//Remove all elements from Arraylist example
package com.stegno.ArrayList;

import java.util.ArrayList;

public class RemoveAllArrayList {
	public static void main(String[] args) {
		 
	    // Create a ArrayList
	    ArrayList<String> al = new ArrayList<String>();
	 
	    // Add elements to LinkedList
	    al.add("Iphone");
	    al.add("Samsung");
	    al.add("Oppo");
	    al.add("Vivo");
	    al.add("Blackberry");
	 
	    // Displaying Elements before remove
	    System.out.println("Before clear():");
	    for(String str: al){
	       System.out.println(str);
	    }
	 
	    // Removing all the elements from Arraylist
	    al.clear();
	 
	    // LinkedList elements after remove
	    System.out.println("After clear():" +al.size());
	    for(String str2: al){
	       System.out.println(str2);
	    }
	 }
}
