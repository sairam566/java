package day.one;
import java.util.ArrayList;

public class ArrayList_get_Demo {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		//This method is user to get element at specified index location
		System.out.println(arrayList.get(0));//10
		
		
	}

}

/*
 * Final OutPut
 * -----------------------------------------
 * The element at position 0 is:10
 * -----------------------------------------
 * 
 * */
