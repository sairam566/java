package day.one;
import java.util.ArrayList;

public class ArrayList_clear_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		 
		for(Integer integer:arrayList)
		{
			System.out.print(integer+" ");//10 20 30 40 50
		}
		System.out.println("After using clear function");
		//After execution of this statements all the Objects are cleared
		//in the arrayList Object 
		 arrayList.clear();
		 
		 for(Integer integer:arrayList)
		 {
			 System.out.println(integer+" ");//No output is Displayed.
		 }
	}

}

/*
 * Final OutPut
 * -----------------------------------------
 * 10 20 30 40 50 
 * After using clear function
 * 
 * -----------------------------------------
 * 
 * 
 * */
