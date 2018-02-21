package com.ts.arrun;

import java.util.Scanner;

public class Factorials_Of_N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int factorial=0,result=1;
		do
		{
			System.out.println("Enter a number you want to find Factorials: ");
			factorial=sc.nextInt();
			if(factorial<0)
			{
				System.out.println("The number should be greater than Zero");
			}
		}while(factorial<0);
		System.out.println();
		System.out.print("The factorial of "+factorial+" is: ");
		
		if(factorial==0 || factorial==1)
		{
			System.out.print(1);
		}
		else
		{
			for(int i=2;i<=factorial;i++)
			{
				result*=i;
			}
			System.out.print(result);
		}
		
	}

}
