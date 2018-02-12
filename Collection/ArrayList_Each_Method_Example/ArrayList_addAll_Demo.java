package day.one;
import java.util.ArrayList;

public class ArrayList_addAll_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList1=new ArrayList<Integer>();
		arrayList1.add(10);
		arrayList1.add(20);
		arrayList1.add(30);
		arrayList1.add(40);
		arrayList1.add(50);
		 
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		arrayList2.add(60);
		arrayList2.add(70);
		arrayList2.add(80);
		//now we are adding arrayList2 to the arrayList1.
		//Using predefined method call addAll(Collection c)
		//which takes a input of Collection Objects.
		arrayList1.addAll(arrayList2);
		for(Integer obj:arrayList1)
		{
			System.out.println(obj);
		}
	}

}
