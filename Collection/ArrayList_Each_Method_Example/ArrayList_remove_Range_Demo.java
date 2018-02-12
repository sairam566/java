import java.util.ArrayList;

public class ArrayList_remove_Range_Demo extends ArrayList {

	/* Since removeRange is a protected member we have to
	 * extend the ArrayList class in order to use the 
	 * protected method removeRange
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		ArrayList_remove_Range_Demo arrayList=new ArrayList_remove_Range_Demo();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		arrayList.add(80);
		arrayList.add(90);
		arrayList.add(100);
		System.out.print("List of all elements: ");
		for(Object integer:arrayList)
		{
			System.out.print(integer+" ");
		}
		System.out.println();
		//This method is used to remove all elements in a specified range.
		//This method takes two arguments int fromindex and int toindex.
		//fromindex specifies where to start.
		//toindex specifies where to end toindex is exclusive. 
		
		arrayList.removeRange(1,9);
		
		System.out.println("Removing elements with in the range 1 to 9 ");
		
		System.out.print("The elements that are present now are: ");
		for(Object integer:arrayList)
		{
			System.out.print(integer+" ");
		}
	}
}
/*
 * OutPut
 * ----------------------------------
 * List of all elements: 10 20 30 40 50 60 70 80 90 100 
 * 
 * Removing elements with in the range 1 to 9 
 * 
 * The elements that are present now are: 10 100 
 * 
 * 
 * */
 