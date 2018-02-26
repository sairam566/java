package com.ts.arundayfour;

public class AllArrayMethod {
	
	

	public static boolean isRowsSameSize(int a[][]) {

		for (int i = 1; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				return false;
			}
		}
		return true;
	}

	public static boolean equalOrder(int a[][], int b[][]) {

		if (a.length != b.length) {
			return false;
		}
		// TO DO
		
		if(isRowsSameSize(a) && isRowsSameSize(b))
		{
			for (int i = 0; i < b.length; i++) {
				if(a[i].length != b[i].length)
				{
					return false;
				}
			}
		return true;
		}
		return false;
	}
	
	
	
	public static boolean equal(int[][] a, int[][] b) {
		
		if(isRowsSameSize(a) && isRowsSameSize(b))
		{
			if(equalOrder(a,b))
			{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(a[i][j] != b[i][j])
					{
						return false;
					}
				}
			}
			return true;
			}
		}
		return false;
	}
	
	
	public static boolean isSquare(int[][] matrix) {
	
		if(isRowsSameSize(matrix))
		{
			if(matrix.length == matrix[0].length)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static int[][] add(int[][] a, int[][] b){
		
		if (isRowsSameSize(a) && isRowsSameSize(b))
		{
			if (equalOrder(a, b)) 
			{
				int[][] array = new int[a.length][a[0].length];
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						array[i][j] = a[i][j] + b[i][j];
					}
				}
				return array;
			}
		}
		return null;
	}
	
	public static boolean isMatricesEligibleForProduct(int[][] a, int[][] b){
		
		if(isRowsSameSize(a) && isRowsSameSize(b))
		{
			for(int i=0;i<a.length;i++)
			{
				
					if(a[i].length != b.length)
					{
						return false;
					}
				
			}
			return true;
		}
		return false;
	}

	public static int[][] multiply(int[][] a, int[][] b){
		
		if(isMatricesEligibleForProduct(a, b))
		{
			int[][] arr=new int[a.length][b[0].length];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					for(int k=0;k<b.length;k++)
					{
						arr[i][j]+=a[j][k]*b[k][j];
					}
				}
			}
			return arr;
		}
		
		
		return null;
	}
	
	public static void main(String[] args) {

		int[][] a = { { 1,2,3},{4,5,6}};
		int[][] b = { { 7,8},{9,10},{11,12} };

		//System.out.println(isRowsSameSize(a));
		//System.out.println(equal(a, b));
		//System.out.println(isSquare(a));
		//System.out.println(equalOrder(a, b));
		
		System.out.println(isMatricesEligibleForProduct(a, b));
		
		
		int[][] sum=multiply(a, b);
		if(sum!= null)
		{
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		}
		else
		{
			System.out.println("not equal");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}