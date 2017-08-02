import java.util.Random;
class HandleError
{
	public static void main(String[] args) 
	{
		int a,b,c;
	    a=b=c=0;
		Random rand=new Random();
		for (int i=0;i<10;i++ )
		{
			try
			{
				a=rand.nextInt();
				b=rand.nextInt();
				c=1234/(a/b);
			}		
			catch(ArithmeticException e)
			{
				System.out.println("---------Divide by Zero");
				c=0;
			}
			System.out.println("c:= "+c);
		}	
	}
}