package com.ts.arrun;

import java.util.Scanner;

public class Sum_Of_Even_No_UpTo_N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=0,count=0,sum=0;
		do
		{
			System.out.println("Enter the a number do you want: ");
			range=sc.nextInt();
			if(range<=0)
			{
				System.out.println("The number should be greater than Zero");
			}
		}while(range<=0);
		System.out.println();
		System.out.print("The sum of "+range+" Even numbers is: ");
		for(int i=2;count<range;i=i+2)
		{
			sum+=i;
			count++;
		}
		System.out.print(sum);
	}

}
