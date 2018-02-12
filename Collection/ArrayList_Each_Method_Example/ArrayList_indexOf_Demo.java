import java.util.ArrayList;

public class ArrayList_indexOf_Demo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(40);
		
		//This method is used to return the First occurance of index position of an Object. 
		
		System.out.println("The index position of 10 is: "+arrayList.indexOf(10));
		
		
		//This method return -1 if the Object is not present in the arrayList.
		System.out.println("The index position of 50 is: "+arrayList.indexOf(50));
	}
}
/*
 * OutPut
 * ----------------------------------
 * The index position of 10 is:0
 *
 *The index position of 50 is: -1
 * */
 
