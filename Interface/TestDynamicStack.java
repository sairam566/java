class DynamicStack implements InStack
{
	private int stack[];
	private int tos;

	DynamicStack(int size)
	{
		stack=new int[size];
		tos=-1;
	}
	public void push(int x)
	{
		if(tos==stack.length-1)
		{
			int temp[]=new int[stack.length*2];
			for (int i=0;i<stack.length ;i++ )
			{
				temp[i]=stack[i];	
			}
			stack=temp;
			stack[++tos]=x;
		}
		else
		{
			stack[++tos]=x;
		}
	}
	public int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack underFlow");
			return 0;
		}
		else
			return stack[tos--];
	}
}
class TestDynamicStack
{
	public static void main(String[] args) 
	{
		DynamicStack ds=new DynamicStack(5);
		for (int i=0;i<12 ;i++ )
		{
			ds.push(i);		
		}	
		System.out.println("--------------------------------");
		for (int i=0;i<12 ;i++ )
		{
			System.out.println(ds.pop());	
		}
	}
}