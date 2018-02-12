import java.util.ArrayList;

public class ArrayList_lastIndexOf_Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(40);
		
		//This method is used to return the Last occurrence of index position of an Object. 
		
		System.out.println("The lastindex position of 10 is: "+arrayList.lastIndexOf(10));
		
		//This method return -1 if the object is not present in the arrayList.
		System.out.println("The lastindex position of 50 is: "+arrayList.lastIndexOf(50));
	}
}
/*
 * OutPut
 * ----------------------------------
 * The lastindex position of 10 is: 1
 * 
 * The lastindex position of 50 is: -1
 * 
 * */
 