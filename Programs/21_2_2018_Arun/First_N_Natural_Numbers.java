package com.ts.arrun;

import java.util.Scanner;

public class First_N_Natural_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int range=0;
		do
		{
		System.out.println("Enter how many numbers do you want to print: ");
		range=sc.nextInt();
		if(range<=0)
		{
			System.out.println("The number should be Greater than Zero");
		}
		}while(range<=0);
		for(int i=1;i<=range;i++)
		{
			System.out.print(i+" ");
		}
	}

}
