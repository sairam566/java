package com.ts.arrun;

import java.util.Scanner;

public class First_N_Even_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=0;
		do
		{
			System.out.println("Enter the a number do you want: ");
			range=sc.nextInt();
			if(range<=0)
			{
				System.out.println("The number should be greater than Zero");
			}
		}while(range<=0);
		System.out.println("The even numbers are:");
		for(int i=2;i<=range;i=i+2)
		{
			System.out.print(i+" ");
		}
	}

}
