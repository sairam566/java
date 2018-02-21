package com.ts.arrun;

import java.util.Scanner;

public class Even_Numbers_UpTo_N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=0,count=0;
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
		System.out.print("the Even numbers are: ");
		for(int i=2;count<range;i=i+2)
		{
			System.out.print(i+" ");
			count++;
			
		}
		

	}

}
