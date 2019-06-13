// Java Method Overriding

package com.stegno.polymorphism.Overriding;

//Parent class.  
class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

// Creating child classes.
class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}


