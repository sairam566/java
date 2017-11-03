package assigmnent1;

public class SwapTwoVariables 
{
	public static void main(String[] args)
	{
		int value1=12;
		int value2=32;
		
		int temp;
		
		System.out.println("Values before Swap");
		System.out.println("value of First Variable :"+value1);
		System.out.println("Value of Second Variable:"+value2);
		System.out.println();
		
		temp=value1;
		value1=value2;
		value2=temp;
		
		System.out.println("Values After Swap");
		System.out.println("value of First Variable :"+value1);
		System.out.println("Value of Second Variable:"+value2);
	}

}
