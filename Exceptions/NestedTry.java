class NestedTry
{
	public static void main(String[] args) 
	{
		try
		{
			int a=args.length;
			System.out.println(a);
			int b=66/a;
			try
			{
				if (a==1)
				{
					a=a/(a-a);
				}
				if (a==2)
				{
					int c[]={1};
			        c[22]=56;
				}
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index out of bound");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by 0:"+ae);
		}	
	}
}