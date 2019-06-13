//code converts a Queue to a List (LinkedList --> ArrayList)
package com.java.StegnoCloud;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Conversion1 {

	public static void main(String[] args) {
		Queue queue = new LinkedList();
		queue.add("Welcome");
		queue.add("Students");
		List list = new ArrayList(queue);

		System.out.println(list);
	}

}
