package com.ts.arundaytwo;

public class Digits_In_A_Number {

	public static void main(String[] args) {
		int number=123,count=0;
		System.out.print(number+" has ");
		while(number!=0)
		{
			number/=10;
			count++;
		}
		System.out.println(count+" digits");

	}

}
