package assignment3;

public class CheckForLeafYear 
{
	public static void main(String[] args) 
	{
		int year=2008;
		
		if(year%4==0)
		{
			System.out.println("The Year "+year+" is Leaf Year");
		}
		else
		{
			System.out.println("The Year "+year+" is Not a Leaf year");
		}
	}
}
