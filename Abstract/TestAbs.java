abstract class Abs
{
	 int a;
	abstract void absMeth1();
	void absMeth2()
	{
		System.out.println("From Abstract class-->absMeth2()");
	}
}
class TestAbs extends Abs
{
	public void absMeth1()
	{
		System.out.println("form TestAbs class");
	}
	public static void main(String[] args) 
	{
		TestAbs tabs=new TestAbs();
		tabs.absMeth1();
		tabs.absMeth2();
	}
}