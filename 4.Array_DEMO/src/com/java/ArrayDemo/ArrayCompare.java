package com.java.ArrayDemo;


	import java.util.Arrays;
	class ArrayCompare
	{
	    public static void main (String[] args) 
	    {
	        int arr1[] = {1, 2, 3};
	        int arr2[] = {1, 2, 3};
	        if (Arrays.equals(arr1, arr2))
	            System.out.println("Same");
	        else
	            System.out.println("Not same");
	    }
	}

