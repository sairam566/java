import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String name;
	private List<Answer> answers;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int id, String name, List<Answer> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void display()
	{
		System.out.println("Id is "+id+" Question is: "+name);
		Iterator<Answer> iterator=answers.iterator();
		while (iterator.hasNext()) {
			Answer answer = (Answer) iterator.next();
			System.out.println(answer);
		}
	}
	
}
