package com.stegno.arraysimple;

public class JaggedArray {

	public static void main(String[] args) {
		// Declar & initialise 2D array
		int arr[][] = { { 10, 20, 30 }, { 17,35 }, { 1, 2, 3,54 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
