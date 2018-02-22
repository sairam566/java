package com.ts.arundaytwo;

public class Sum_Of_Digits_Of_Number {

	public static void main(String[] args) {
		int number = 566, result = 0;		
		while (number != 0) {
			result += number % 10;
			number /= 10;
		}
		System.out.println(result);

	}

}
