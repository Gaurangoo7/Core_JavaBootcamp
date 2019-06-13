package com.stegno.Encapsulation;

class Employee {
	private String id; // private field

	//Getter & Setter method (In same class) to access private variable 
	public String getId() { // private field accessed inside public method
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
