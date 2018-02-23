package com.ts.arundaythree;

public class Methods {

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
	
	public static int secondLargest(int[] arr)
	{
		
	}
	
	
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

	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 8, 10, 12, 14, 3, 5 };

		System.out.println(smallestElement(array));
		
	}

}
