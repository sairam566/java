package day.one;
import java.util.ArrayList;

public class ArrayList_contains_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		 
		//Check if the specified Object is present in the Collection.
		//Return true if present
		System.out.println("Is element 40 present: "+arrayList.contains(40));
		//It return false if not present
		System.out.println("Is element 11 present: "+arrayList.contains(11));
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
