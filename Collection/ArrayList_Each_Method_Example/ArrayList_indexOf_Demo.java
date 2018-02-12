import java.util.ArrayList;

public class ArrayList_indexOf_Demo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		
		//This method is used to return the index position of an Object. 
		
		System.out.println("The index position of 30 is: "+arrayList.indexOf(30));
	}
}
/*
 * OutPut
 * ----------------------------------
 * The index position of 30 is: 2
 * */
 