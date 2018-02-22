package com.ts.arundaytwo;

public class Reverse_Of_A_Number {

	public static void main(String[] args) {
		int number = 123;
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		System.out.println(reverse);
	}

}
