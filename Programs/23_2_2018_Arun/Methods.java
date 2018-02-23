package com.ts.adaythree;
public class Methods {

	
	
	public static int digitCount(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		return count;
	}
	
	public static int powerOf(int base,int power)
	{
		int result=1;
		for(int i=0;i<power;i++)
		{
			result*=base;
		}
		return result;
	}
	public static int armstrongCheck(int n)
	{
		int power=digitCount(n);
		int result=0;
		while(n!=0)
		{
			result+=powerOf(n%10, power);
			n/=10;
		}
		return result;
	}
	public static boolean isArmstrong(int n)
	{
		return n==armstrongCheck(n);
	}
	
	public static String listOfArmstrong(int[] arr)
	{
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			if(isArmstrong(arr[i]))
			{
				result+=arr[i]+" ";
			}
		}
		return result;
	}
	
	public static void displayArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void displayEvenElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}
	}

	public static int countEvenElements(int[] arr) {
		if (arr.length <= 0) {
			return -1;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int sumOfElements(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
       			sum+=arr[i];
		}
		return sum;
	}	
	
	public static boolean isPrime(int n)
	{
		return n!=0 && factorsOfNumber(n)==2;
	}

	
	public static int factorsOfNumber(int n)
	{
		int count=0;
   		for(int i=1;i<=n;i++)
		{
   			if(n%i==0)
			{
			count++;
			}
		}
		return count;
	}
	
	public static int factorialOfNumber(int n)
	{
		if(n==0 || n==1)
			return 1;
		int result=1;
		for(int i=2;i<=n;i++)
		{
			result*=i;
		}
		return result;
	}
	
	public static int sumFactorialOfDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum+=factorialOfNumber(n%10);
			n/=10;
		}
		return sum;
	}
	public static boolean isStrong(int n)
	{
		return n==sumFactorialOfDigits(n);
	}
	
	public static int sumOfFactors(int n)
	{
		int sum=0;
   		for(int i=1;i<n;i++)
		{
   			if(n%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	public static boolean isPerfect(int n)
	{
	 	return n==sumOfFactors(n);
	}

	public static String listOfStrongNo(int[] arr)
	{
		 String result="";
		for(int i=0;i<arr.length;i++)
		{
			if(isStrong(arr[i]))
			{
				result+=arr[i]+" ";
			}
		}
		return result;
	}
	
	public static String listOfPrimeNo(int[] arr)
	{
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				result+=arr[i]+" ";
			}
		}
		return result;
	}
	
	public static String listOfPerfectNo(int[] arr)
	{
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			if(isPerfect(arr[i]))
			{
				result+=arr[i]+" ";
			}
		}
		return result;
	}
	public static int largestElement(int[] arr)
	{
		int largest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		return largest;
	}
	
	public static int smallestElement(int[] arr)
	{
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		return smallest;
	}
	
//	public static int secondLargest(int[] arr)
//	{
//		
//	}
//	
	
	public static void splitEvenOdd(int[] arr) {

		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < arr.length; i++) {

			evenCount += arr[i] % 2 == 0 ? 1 : 0;
			oddCount += arr[i] % 2 == 1 ? 1 : 0;

		}
		int[] evenno = new int[evenCount];
		int[] oddno = new int[oddCount];

		int e = 0, o = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenno[e] = arr[i];
				e++;
			} else {
				oddno[o] = arr[i];
				o++;
			}
		}
		System.out.println("even Numbers array");
		displayArray(evenno);
		System.out.println();
		System.out.println("odd numbers array");
		displayArray(oddno);
	}
	public static int rotate(int n)
	{
		int base=1;
		int no=digitCount(n);
		for(int i=1;i<=no-1;i++)
		{
			base*=10;
		}
		
		int rem=n/base;
		return (n%base)*10+rem;
	}
	public static boolean isCircularPrime(int n)
	{
		int nCopy=n;
		while(isPrime(n))
		{
			n=rotate(n);
			if(nCopy==n)
			{
				return true;
			}
		}
		return false;
	}
	public static String listOfCircularPrime(int[] arr)
	{
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			if(isCircularPrime(arr[i]))
			{
				result+=arr[i]+" ";
			}
		}
		return result;
	}
	
	public static void display2DArray(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[] array = { 1193, 3779, 11939, 19937, 371, 407,2,145,6,28 };
		int[][] twoDArray={{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(listOfPrimeNo(array));
		//System.out.println(listOfPerfectNo(array));
		//System.out.println(listOfStrongNo(array));
		//System.out.println(listOfArmstrong(array));
		//System.out.println(listOfCircularPrime(array));
		display2DArray(twoDArray);
		
	}

}
