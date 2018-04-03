
public class Student {

	private int rollNo;
	private String name;
	private int marks;
	private Address address; 
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(int rollNo,String name,int marks,Address address)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		this.address=address;
	}
	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public void displayInfo()
	{
		System.out.println("Hello "+name +" your rollno is "+rollNo+" and your marks are:"+marks);
		System.out.println(address.toString());
	}
	
}
