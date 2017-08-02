class TryAndCatch
{
	public static void main(String[] args) 
	{
		try
		{
			int a=0;
	    	int b=66/a;
		    System.out.println("b"+b);
		}	
		catch (Exception e)
		{
			System.out.println("Divide by zero Exception");	
		}
		System.out.println("After the catch ");
	}
}