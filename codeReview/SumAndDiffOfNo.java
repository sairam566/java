package assigmnent1;

public class SumAndDiffOfNo
{
	public static void main(String[] args)
	{
		int value1=12;
		
		int num1,num2,sum,difference;
		
		num1=value1/10;
		num2=value1%10;
		sum=num1+num2;
		difference=num1-num2;
		
		System.out.println("The Sum of "+value1+" is "+num1+" + "+num2+" = "+sum);
		System.out.println();
		System.out.println("The Difference of "+value1+" is "+num1+" - "+num2+" = "+difference);
	}
}
