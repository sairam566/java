package com.ts.arundaytwo;

public class Strong_Number {
	public static void main(String[] args) {
		int number=145;
		int copyNumber=number,result=0;
		while(number!=0)
		{
			int remainder=number%10;
			int factorial=1;
			for(int i=1;i<=remainder;i++)
			{
				factorial*=i;
			}
			result+=factorial;
			number/=10;
		}
		if(copyNumber==result)
		{
			System.out.println("Strong Number");
		}
		else
		System.out.println("Not a Strong Number");
	}

}
