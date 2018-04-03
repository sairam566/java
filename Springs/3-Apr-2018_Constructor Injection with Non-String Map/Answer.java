import java.util.Date;

public class Answer {

	private int id;
	private String answer;
	private Date postedDate;
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Answer(int id, String answer, Date postedDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}
	
	public String toString()
	{
		return "Answer Id is: "+id+" Answer is: "+answer+" Answer postedDate is: "+postedDate;
	}
}
