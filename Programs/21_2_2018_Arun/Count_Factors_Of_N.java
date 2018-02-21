package com.ts.arrun;

import java.util.Scanner;

public class Count_Factors_Of_N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=0,count=0;
		do
		{
			System.out.print("Enter the  number you want to find factors:  ");
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
				count++;
			}
		}
		System.out.println(range+" has "+count+" factors from range 1 to "+range);

	}

}
