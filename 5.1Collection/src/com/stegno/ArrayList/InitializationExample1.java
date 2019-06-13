//Initialization using Arrays.asList
package com.stegno.ArrayList;

import java.util.*;

public class InitializationExample1 {
	public static void main(String args[]) {
		//initialise ArrayList using Arrays.asList
		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Delhi", "Mumbai", "Dhule"));
		System.out.println("Elements are:" + obj);
	}
}