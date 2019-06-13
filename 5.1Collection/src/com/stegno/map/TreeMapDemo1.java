package com.stegno.map;

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {

		// Dec map
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "Shivani");
		map.put(102, "Himani");
		map.put(108, "Ashwini");

		map.put(103, "Ashwini");
		map.put(150, "Gaurang");
		map.put(170, "Shivani");

		System.out.println("Headmap:" + map.tailMap(103, true));
	}
}
