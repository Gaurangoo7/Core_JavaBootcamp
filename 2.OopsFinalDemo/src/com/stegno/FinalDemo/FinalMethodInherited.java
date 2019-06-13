package com.java.FinalDemo;

public class bike {

	final void run() {
		System.out.println("running...");
	}
}

class FinalMethodInherited extends bike {
	public static void main(String args[]) {
		new FinalMethodInherited().run();
	}
}
