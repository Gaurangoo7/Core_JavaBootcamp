package com.stegno.Interface;

//Interface declaration: by first user  
interface Bank {
	float rateOfInterest();
}
//Implementation: by second user  SBI
class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}

//Implementation: by second user PNB
class PNB implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}

class BankInterface {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}
