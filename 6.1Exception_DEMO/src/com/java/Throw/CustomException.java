package com.stegno.Throw;

public class CustomException {

	public static void main(String[] args) {
		try {
			// Throw custom exception
			throw new MyException();
		} catch (MyException e) {
			System.out.println(e);
		}

	}

}
