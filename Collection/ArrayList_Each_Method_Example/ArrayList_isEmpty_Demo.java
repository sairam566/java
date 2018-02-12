import java.util.ArrayList;

public class ArrayList_isEmpty_Demo {

	public static void main(String[] args) {
		
		//ArrayList1
		ArrayList<Integer>arrayList1=new ArrayList<Integer>();
		
		//ArrayList2
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		arrayList2.add(10);
		arrayList2.add(20);
		arrayList2.add(30);
		arrayList2.add(40);
		
		//This method return true is arrayList is empty.  
		
		System.out.println("Is arrayList1 is empty: "+arrayList1.isEmpty());
		
		System.out.println("Is arrayList2 is empty: "+arrayList2.isEmpty());
	}
}
/*
 * OutPut
 * ----------------------------------
 * Is arrayList1 is empty:true
 * 
 * Is arrayList2 is empty:false
 * 
 * */
 