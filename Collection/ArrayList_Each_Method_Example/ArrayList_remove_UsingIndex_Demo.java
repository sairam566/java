import java.util.ArrayList;

public class ArrayList_remove_Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		System.out.print("List of all elements: ");
		for(Integer integer:arrayList)
		{
			System.out.print(integer+" ");
		}
		System.out.println();
		//This method is used to return the object that has been removed.
		//This method is user to take index position as input.
		System.out.println("The element removed at index 2: "+arrayList.remove(2));
		System.out.print("The elements all elements now are: ");
		for(Integer integer:arrayList)
		{
			System.out.print(integer+" ");
		}
	}
}
/*
 * OutPut
 * ----------------------------------
 * List of all elements:10 20 30 40
 * 
 * The element removed at index 2: 30
 * 
 * The lastindex position of 50 is: 10 20 40
 * 
 * 
 * */
 
