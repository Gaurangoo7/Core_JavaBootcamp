//Multiple Concepts (Object,Constructor, Encapsulation + Super/this keyword )Program 
package com.stegno.object;

public class Stegnocloud {
	// Private data member -> Encapsulation
	private String name;
	private String college;

	// Parameterized Constructor
	public Stegnocloud(String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}

	// getter & setter methods for encapsulation
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public static void main(String[] args) {
		// Declaration: The code Stegnocloud Stegnocloud; declarations that
		// associate a variable name with an object type.
		// Instantiation: The new keyword is a Java operator that creates the
		// object.
		// Initialization: The new operator is followed by a call to a
		// constructor, which initializes the new object.
		Stegnocloud stegnocloud = new Stegnocloud("Komal", "Mumbai");
		Stegnocloud stegnocloud2 = new Stegnocloud("Rushi", "SSVPS");
		Stegnocloud stegnocloud3 = new Stegnocloud("Dhanashri", "SVKM");
		System.out.println(" Can anyone Guess what is answer of this statement ? " +stegnocloud );
		System.out.println(" Can anyone Guess what is answer of this statement ? " +stegnocloud2 );
		System.out.println(" Can anyone Guess what is answer of this statement ? " +stegnocloud3 );
		//How you can get the values assigned to object ?
	}
}