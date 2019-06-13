//Exception handling using try-catch
package com.stegno.ExceptionHandling;
import java.lang.ArrayIndexOutOfBoundsException;

//import java.lang.Exception;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, 9 };

		try {
			System.out.println("5th Element of Array is  " + arr[5]); // Exception
																		// ->
																		// AOBIE
		}
		/*catch (Exception e) {
			System.out.println("The exception is :" +e);
		}*/
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("The exception is :" +ex);} 
		
		

	}

}
