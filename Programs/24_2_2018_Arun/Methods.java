package com.ts.arundayfour;

public class Methods {

	public static void display2DArray(int[][] arr) {
		int row = arr.length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] add2DArray(int[][] arr1, int[][] arr2) {

		int row = arr1.length;
		int column = arr1[0].length;

		int sum[][] = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return sum;
	}
	
	public static void sumOfRow(int[][] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
			}
			System.out.println("---------------"+sum);
		}
	}
	
	public static int largestSumOfRow(int[][] arr)
	{
		int row=arr.length;
		int largest=0;
		for(int i=0;i<row;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];
			}
			largest=(sum>largest)?sum:largest;
		}
		return largest;
	}
	
	public static int diagonalSumLR(int[][] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i][i];
		}
		return sum;
	}
	
	public static int diagonalSumRL(int[][] arr)
	{
		int sum=0;
		int column=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			
				sum+=arr[i][column];
				column--;
			
		}
		return sum;
	}
	public static void sumOfOuterElements(int[][] arr)
	{
		int totalSum=0,innerSum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				totalSum+=arr[i][j];
			}
		}
		for(int i=1;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length-1;j++)
			{
				innerSum+=arr[i][j];
			}
		}
		System.out.println(totalSum+"    "+innerSum);
		System.out.println("Outer Matrix Sum: "+(totalSum-innerSum));
	}
	
	public static boolean isEqual(int[][] arr1,int[][] arr2)
	{
		boolean flag=false;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j] != arr2[i][j])
				{
					return false;
				}
			}
		}
		return true;
	}
//	public static int[][] matrixMultiplication(int[][] arr1,int[][] arr2)
//	{
//		
//	}
	
	public static int[][] isTranspose(int[][] arr)
	{
		int[][] temp=new int[arr.length][arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				temp[j][i]=arr[i][j];
			}
		}
		return temp;
	}
	
	public static boolean isSymmetric(int[][] arr)
	{
		return isEqual(isTranspose(arr), arr);
	}
	
	public static boolean isSkewSymmetric(int[][] arr)
	{
		int temp[][]= new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				temp[i][j]=arr[i][j];
				arr[i][j]=-(arr[i][j]);
			}
		}
		
		return isEqual(isTranspose(temp), arr);
	}
	
	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] array2 = { { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] diagonal={{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{4,5,6,1,2}};
		int[][] array3={{1,2,3,4,5},
						{1,2,3,4,5},
						{4,3,2,1,5},
						{3,2,1,4,5},
						{1,2,3,4,5}
						};
		int[][] transpose={{1,2,3},{4,5,6},{1,2,3}};
		int[][] symmetric={{1,2,3},{2,3,1},{3,1,2}};
	//	int sum[][] = add2DArray(array, array2);
	//	display2DArray(sum);
	//	sumOfRow(array2);
	//	System.out.println(largestSumOfRow(array2));
	//	System.out.println(diagonalSumLR(diagonal));
	//	sumOfOuterElements(array3);
	//	int[][] x=add2DArray(array,array2);	
	//	display2DArray(x);
	//	System.out.println(isEqual(array,array2));
		
	//	display2DArray(isTranspose(transpose));
		
	//	System.out.println(isSymmetric(symmetric));
		
		System.out.println(isSkewSymmetric(symmetric));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String name="1,2,3...7,8...13,14,15";
//		name=name.replace("," , " ");
//		System.out.println(name);
//		for(int i=0;i<name.length();i++)
//		{
//			if(name.charAt(i)=='.')
//			{
//				name=replaceCharAt(name, i, (char)((i-1)+'0'));
//			}
//		}
//		System.out.println("------------------------");
//		System.out.println(name);
	}
	
//	public static String replaceCharAt(String s, int pos, char c) {
//	    return s.substring(0, pos) + c + s.substring(pos + 1);
//	  }
}
