package com.stegno.Throw;

class MyException extends Exception {
	int a;

	MyException(int b);
	a=b;

	}

	public String toString() {
		return ("Exception number = " + a);
	}
}