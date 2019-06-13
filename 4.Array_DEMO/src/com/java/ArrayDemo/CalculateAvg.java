package com.java.ArrayDemo;

public class CalculateAvg {

	public static void main(String[] args) {
		// initialise array
		double[] numArray = { 54.3, 74.5, -53.6, 98.34, 43.0, 62.6 };
		double sum = 0.0;
		double largest = numArray[0];
//To find largest number 
		for (double num : numArray) {
			sum += num;
		}
		double average = sum / numArray.length;
		

		for (double num : numArray) {
			if (largest < num)
				largest = num;
		}

		System.out.format("The average is: %.2f", average);
		System.out.format("\nLargest element = %.2f", largest);

		
	}
}
