package com.java.ArrayDemo;

import java.util.Arrays;

public class RemoveDuplicate {
	public static int removeDuplicateElements(int arr[], int n) {
	
		if (n == 0 || n == 1) {
			return n;
		}
		// initialize temp array
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		// initialise array which is sorted
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50,60 };
		
		/*Arrays.sort(arr); --> Use this method if array is unsorted 
		 	int arr[] = {90, 10, 20, 20, 30, 30, 40, 50, 50,60 };
		*/
		//Find length of array
		int length = arr.length;
		//Calling method removeDuplicateElementsand storing result in length variable
		length = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}
}