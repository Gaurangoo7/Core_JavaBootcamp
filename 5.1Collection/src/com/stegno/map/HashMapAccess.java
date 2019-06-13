package com.stegno.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapAccess {
	public static void main(String[] args) {

		HashMap<String, String> userCity = new HashMap<>();

		// Check if a HashMap is empty
		System.out.println("is userCity empty? : " + userCity.isEmpty());

		userCity.put("Sumit", "Pune");
		userCity.put("Sejal", "Mumbai");
		userCity.put("Himani", "Dhule");

		System.out.println("userCity HashMap : " + userCity);

		// Find the size of a HashMap
		System.out.println("We have the city information of " + userCity.size() + " users"); 

		
		//Check duplicate keys + values are allowed or not
		userCity.put("Deepak", "Dhule");
		System.out.println(userCity);
	
		userCity.put(null, "Surat");
		
		userCity.put(null, "Nagpur");
		
		System.out.println(userCity);
		
		
		String userName = "Raga";
		// Check if a key exists in the HashMap
		if (userCity.containsKey(userName)) {
			// Get the value assigned to a given key in the HashMap
			String city = userCity.get(userName);
			System.out.println(userName + " lives in " + city);
		} else {
			System.out.println("City details not found for user " + userName);
		}

		// Check if a value exists in a HashMap
		
		if (userCity.containsValue("Nashik")) {
			System.out.println("There is a user in the userCity who lives in Nashik");
		} else {
			System.out.println("There is no user in the userCity who lives in Nashik");
		}

		// Modify the value assigned to an existing key
		userCity.put(userName, "Nashik");
		System.out.println(userName + " moved to a new city " + userCity.get(userName)
				+ ", New userCity : " + userCity);

		// The get() method returns `null` if the specified key was not found in
		// the HashMap
		System.out.println("Himani city : " + userCity.get("Himani"));
		
		//Remove object 
		String user = "Sumit";
		String city = userCity.remove(user);
		System.out.println(userCity);

	}
}
