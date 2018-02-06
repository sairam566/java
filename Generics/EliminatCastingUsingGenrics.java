import java.util.List;
import java.util.ArrayList;
public class EliminatCastingUsingGenrics 
{
	public static void main(String[] args) 
	{		
		//The following code snippet without generics requires Type-casting
		List list=new ArrayList();
		list.add("SAIRAM");
		//if i need to store the list object in String i nead to perform Type-casting
		String name=(String)list.get(0);
		
		System.out.println("You name is: "+name);
		
		//When re-written to use generics, the code does not require casting:
		
		List<String> genList=new ArrayList<String>();
		genList.add("Thadi");
		String surName=genList.get(0);
		
		System.out.println("Your SurName is: "+surName);
	}

}
