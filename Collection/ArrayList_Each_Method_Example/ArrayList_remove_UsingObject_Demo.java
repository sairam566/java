import java.util.ArrayList;

public class ArrayList_remove_UsingObject_Demo {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("sai");
		arrayList.add("ram");
		arrayList.add("good");
		arrayList.add("bad");
		System.out.print("List of all elements: ");
		for(String str:arrayList)
		{
			System.out.print(str+" ");
		}
		System.out.println();
		//This method is used to remove first occurrence of object in the arrayList
		//This method is user to take object as input.
		//Return true if object is deleted from the list.
		System.out.println("The Object bad is removed: "+arrayList.remove("bad"));
		System.out.print("All elements now are: ");
		for(String str:arrayList)
		{
			System.out.print(str+" ");
		}
	}
}
/*
 * OutPut
 * ----------------------------------
 * List of all elements:sai ram good bad
 * 
 * The Object bad is removed: true
 * 
 * All elements now are: sai ram good 
 * 
 * 
 * */
 