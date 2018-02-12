package day.one;
import java.util.ArrayList;

public class ArrayList_add_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		for(Integer obj:arrayList)
		{
			System.out.println(obj);
		}
	}

}
