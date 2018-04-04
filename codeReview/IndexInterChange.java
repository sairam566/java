package com.idsl.march;

import java.util.Arrays;

public class IndexInterChange {

	public static void main(String[] args) {
		int[] arr= {3,2,0,1};
		for(int i=0;i<arr.length;i++)
		{
		System.out.print("  "+i);
		}
		System.out.println(" Index Position");
		System.out.println(" "+Arrays.toString(arr)+" Original Array");
		System.out.println(" "+Arrays.toString(swapArr(arr))+" Swaped Array");
	}

	public static int[] swapArr(int[] arr) {
		if(arr.length%2 !=0)
		{
			System.out.println("The array length should be even");
			return null;
		}
		for(int i=0;i<arr.length;i+=2)
		{
			swap(arr,i,i+1);
		}
		return arr;
	}
	
	public static void swap(int[] arr,int positionOne,int positionTwo)
	{
		if(positionOne==positionTwo)
		{
			return;
		}
		int temp=arr[positionOne];
		arr[positionOne]=arr[positionTwo];
		arr[positionTwo]=temp;
	}
}
