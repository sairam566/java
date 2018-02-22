package com.ts.arundaytwo;

public class Number {
	
	public static int countDigits(int n){
		int count=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		return count;
	}
	
	public static int factorial(int n){
		
		if(n==0 || n==1)
		{
			return 1;
		}
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact*=i;
		}
		
		return fact;
		
	}
	
	public static int sumFactorialOfDigits(int n){
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum+=factorial(rem);
			n/=10;
		}
		
		return sum;
		
	}
	
	public static int sumPowerOfDigits(int n){
		return n;
		
	}
	
	public static int power(int base, int power){
		int result=1;
		for(int i=1;i<=power;i++)
		{
			result*=base;
		}
		
		return result;
		
	}
	
	public static boolean isArmstrong(int n){
		return n == sumPowerOfDigits(n);
	}
	
	public static boolean isStrong(int n){
		return n == sumFactorialOfDigits(n);
	}
	
	
	public static void main(String[] args) {
		System.out.println(power(4,3));
	}

}
