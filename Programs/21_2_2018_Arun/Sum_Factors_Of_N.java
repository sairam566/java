package com.ts.arrun;

import java.util.Scanner;

public class Sum_Factors_Of_N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=0,sum=0;
		do
		{
			System.out.print("Enter the  number you want to find Sum of factors:  ");
			range=sc.nextInt();
			if(range<=0)
			{
				System.out.println("\n The number should be greater than Zero \n");
			}
		}while(range<=0);
		System.out.println();
		for(int i=1;i<=range;i++)
		{
			if(range%i==0)
			{
				sum+=i;
			}
		}
		System.out.println("The sum of "+range+" factors is: "+sum);

	}

}
