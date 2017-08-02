interface InStack
{
	void push(int a); //To store an Item
	int pop(); //To remove an Item
}
class FixedStack implements InStack
{
	private int stack[];
	private int tos;

	FixedStack(int size)
	{
		stack=new int[size];
		tos=-1;
	}
	public void push(int a)
	{ 
		if (tos==stack.length-1)
		{
			System.out.println("Stack OverFlow");	
		}
		else
		{
			stack[++tos]=a;
		}
	}
	public int pop()
	{
		if (tos<0)
		{
			System.out.println("Stack empty");	
			return 0;
		}
		else
		{
			 return stack[tos--];
		}
	}
}
class TestFixedStack
{
	public static void main(String[] args) 
	{
		FixedStack fs=new FixedStack(5);
		for (int i=0;i<5;i++ )
		{
			fs.push(i);		
		}	
		System.out.println("---------------------");
		for (int i=0;i<5;i++)
		{
			System.out.println(fs.pop());	
		}
	}
}