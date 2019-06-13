//A Java class to test the encapsulated class Account.  
package com.stegno.Encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		// creating instance of Account class
		Account acc = new Account();
		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setName("Sumo Jaiswal");
		acc.setEmail("sumojaiswal@javatpoint.com");
		acc.setAmount(500000f);
		// getting values through getter methods
		System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
	}
}
