package com.stegno.InterviewBasicProgs;

public class PerfectNumber {
	public static void calPefectNumber(int number) {
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		System.out.println("Perfect numbers:");
		for (int i = 1; i <= 10000; i++)
			calPefectNumber(i);
	}

}
