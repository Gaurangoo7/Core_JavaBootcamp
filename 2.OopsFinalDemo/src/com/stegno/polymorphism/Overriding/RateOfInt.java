//RateOfInt class to create objects and call the methods

package com.stegno.polymorphism.Overriding;

class RateOfInt {
	public static void main(String args[]) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
		
		/*Way 2
		Bank b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
*/	}
}
