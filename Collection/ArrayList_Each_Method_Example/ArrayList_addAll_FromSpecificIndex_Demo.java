package day.one;
import java.util.ArrayList;

public class ArrayList_addAll_FromSpecificIndex_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList1=new ArrayList<Integer>();
		arrayList1.add(10);
		arrayList1.add(20);
		arrayList1.add(60);
		arrayList1.add(70);
		arrayList1.add(80);
		 
		for(Integer integer:arrayList1)
		{
			System.out.print(integer+" ");//10 20 60 70 80
		}
		System.out.println();
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		arrayList2.add(30);
		arrayList2.add(40);
		arrayList2.add(50);
		
		for(Integer integer:arrayList2)
		{
			System.out.print(integer+" ");//30 40 50
		}
		System.out.println();
		//To add the arrayList2 at the specified position in arrayList1
		//We us use addAll(int index,Collection c)
		//where index is the position to add
		//Collection c is the list of Collection
		arrayList1.addAll(2,arrayList2);
		for(Integer obj:arrayList1)
		{
			System.out.print(obj+" ");
		}
	}

}

/*
 * Final OutPut
 * -----------------------------------------
 * 10 20 60 70 80 
 * 30 40 50 
 * 10 20 30 40 50 60 70 80 
 * -----------------------------------------
 * 
 * 
 * */
