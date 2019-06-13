package com.java.ArrayDemo;

public class LargestElement {

	public static void main(String[] args) {
		double[] numArray = { 54.3, 74.5, -53.6, 98.34, 43.0, 62.6 };
		double largest = numArray[0];

		for (double num : numArray) {
			if (largest < num)
				largest = num;
		}

		System.out.format("Largest element = %.2f", largest);

	}

}
