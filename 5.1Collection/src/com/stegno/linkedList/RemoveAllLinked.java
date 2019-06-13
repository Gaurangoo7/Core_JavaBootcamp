//Remove all elements from LinkedList example
package com.stegno.linkedList;

import java.util.LinkedList;

public class RemoveAllLinked {
	public static void main(String[] args) {
		 
	    // Create a LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    linkedlist.add("Iphone");
	    linkedlist.add("Samsung");
	    linkedlist.add("Oppo");
	    linkedlist.add("Vivo");
	    
	 
	    // Displaying Elements before remove
	    System.out.println("Before clear():");
	    for(String str: linkedlist){
	       System.out.println(str);
	    }
	 
	    // Removing all the elements from LinkedList
	    linkedlist.clear();
	 
	    // LinkedList elements after remove
	    System.out.println("After clear():");
	    for(String str2: linkedlist){
	       System.out.println(str2);
	    }
	 }
}
