import java.util.Iterator;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private Map<String,String> answers;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int id, String name, Map<String,String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void display()
	{
		System.out.println("Id is "+id+" Question is: "+name);
		Set<Entry<String,String>> set=answers.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();  
		while(itr.hasNext()){
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
		}
	}
}
