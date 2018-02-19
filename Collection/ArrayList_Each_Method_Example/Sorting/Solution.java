import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public static void main(String[] args) {
		List<Integer> listOfInts=new ArrayList<>();
		listOfInts.add(5);
		listOfInts.add(1);
		listOfInts.add(3);
		listOfInts.add(2);
		listOfInts.add(6);
		listOfInts.add(4);
		for(int i=0;i<listOfInts.size();i++)
		{
			for(int j=i+1;j<listOfInts.size();j++)
			{
			if(listOfInts.get(i)>listOfInts.get(j))
			{
				swap(listOfInts, i, j);
			}
			}
		}
		for(Integer values:listOfInts)
		{
			System.out.println(values);
		}
		
	}
	
	
	public static <E> void swap(List<E> list,int x,int y)
	{
		E temp=list.get(x);
		list.set(x, list.get(y));
		list.set(y, temp);
	}
}