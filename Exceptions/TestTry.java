class TestTry
{
	public static void main(String[] args) throws NullPointerException 
	{

		try
		{
			int a=args.length;
			int b=99/a;

		try
		{
			int x[]={1};
			x[11]=10;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("try inside"+ae);
		}

		}	
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println(ab);
		}
		catch(Exception e)
		{
			System.out.println("Exception ="+e);
		}
		throw new NullPointerException("Demo");
	}
}