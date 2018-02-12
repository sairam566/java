package day.one;
import java.util.ArrayList;

public class ArrayList_ensureCapacity_Demo {
	public static void main(String[] args) {
		//Create a arrayList with size 5.
		ArrayList<Integer> arrayList=new ArrayList<Integer>(5);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		 
		//this will increase the capacity of the ArrayList to 10 elements
		arrayList.ensureCapacity(10);
		
		for(Integer integer:arrayList)
		{
			System.out.print(integer+" ");
		}
	}

}

/*
 * Final OutPut
 * -----------------------------------------
 * Is element 40 present:true
 * 
 * Is element 11 present:false
 * -----------------------------------------
 * 
 * */
