package com.stegno.Encapsulation;

public class EncapsulationTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId("1"); // public method can be accessed outside class.
		System.out.println("emp.getId()  >  " + emp.getId());
	}
}
