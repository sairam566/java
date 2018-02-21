package com.ts.arrun;

import java.util.Scanner;

public class Sum_Of_First_N_Natural_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=0,sum=0;
		do
		{
			System.out.println("Enter the a number do you want: ");
			range=sc.nextInt();
			if(range<=0)
			{
				System.out.println("The number should be greater than Zero");
			}
		}while(range<=0);
		System.out.println("The sum of first N natural numbers is: ");
		for(int i=0;i<=range;i++)
		{
			sum+=i;
		}
		System.out.print(sum);
	}

}
