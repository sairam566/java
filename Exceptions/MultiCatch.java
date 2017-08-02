class MultiCatch
{
	public static void main(String[] args) 
	{
		try
		{
			int a=args.length;
			System.out.println(a);
			int b=66/a;
			int c[]={1};
			c[22]=56;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("divide by Zero");
		}
		catch(ArrayIndexOutOfBoundsException arrb)
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}
		catch (Exception e)
		{
			System.out.println(" "+e);
		}

		System.out.println("After the Try Catch Block");
	}
}