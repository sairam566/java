class AbsInClass
{
	public interface NestedIF
	{
		boolean isNotNegative(int x);
	}
}
class B implements AbsInClass.NestedIF
{
	public boolean isNotNegative(int x)
	{
		return x<0 ? false : true;
	}
}
class NestedIFDemo
{
	public static void main(String[] args) 
	{
		AbsInClass.NestedIF obj=new B();
		if (obj.isNotNegative(10))
		{
			System.out.println("10 is not negative");		
		}	
		if (obj.isNotNegative(-10))
		{
			System.out.println("this will not exicitute");	
		}
	}
}