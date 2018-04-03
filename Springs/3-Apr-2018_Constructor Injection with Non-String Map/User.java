
public class User {

	private int id;
	private String name,email;
	
	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public String toString()
	{
		return "User Id is: "+id+" User Name is: "+name+" user Email is: "+email;
	}
}
