package com.ts.arundaytwo;

public class Number {
	
	
	public static boolean isPrime(int n)
	{
		return n!=0 && factorsOfNumbers(n)==2;
	}
	
	
	public static int circulate(int n)
	{
		String no=String.valueOf(n);
		no=no.substring(1)+no.charAt(0);
		return Integer.parseInt(no);
	}
	public static boolean isCircularPrime(int n)
	{
		int count=0;
		int noOfDigits=countDigits(n);
		if(isPrime(n))
		{
			
//			StringBuilder number=new StringBuilder(new String().valueOf(n));
//			for(int i=0;i<noOfDigits;i++)
//			{
//				char digit=number.charAt(0);
//				number.deleteCharAt(0);
//				number.append(digit);
//				if(isPrime(Integer.parseInt(number.toString())))
//				{
//					count++;
//				}
//			}
			
			for(int i=0;i<noOfDigits;i++)
			{
				
			}
			
			
		}
		 return (count==noOfDigits);
	}
	
	
	public static String strongNoBetween(int lowerLimit,int upperLimit)
	{
		String result="";
		for(;lowerLimit<=upperLimit;lowerLimit++)
		{
			if(isStrong(lowerLimit))
			result+=lowerLimit+" ";
		}
		return result;
	}
	
	public static String armstrongNoBetween(int lowerLimit,int upperlimit)
	{
		String result="";
		for(;lowerLimit<=upperlimit;lowerLimit++)
		{
			if(isArmstrong(lowerLimit))
				result+=lowerLimit+" ";
		}
		return result;
	}
	private static int factorsOfNumbers(int n) {
		int factors=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				factors++;
			}
			
		}
		return factors;
	}


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
		int power=countDigits(n);
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum+=power(rem, power);
			n/=10;
		}
		return sum;
		
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
		// System.out.println(armstrongNoBetween(1, 400));  //1 2 3 4 5 6 7 8 9 153 370 371 
		System.out.println(strongNoBetween(1,200));
		//System.out.println(isArmstrong(372));
	}

}
