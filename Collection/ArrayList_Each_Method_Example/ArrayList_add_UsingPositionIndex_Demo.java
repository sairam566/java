package day.one;
import java.util.ArrayList;

public class ArrayList_add_UsingPositionIndex_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		// add(1,20) Where 1 indicates Position
		// where 20 is the element to be inserted at that position
		arrayList.add(1, 20); 
		for(Integer obj:arrayList)
		{
			System.out.println(obj);
		}
	}

}
