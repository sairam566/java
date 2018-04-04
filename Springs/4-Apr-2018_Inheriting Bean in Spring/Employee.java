package com.indus;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private Address address;
	
	
	
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}



	public Employee(int id, String name, String dept, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Id of Employee: "+id+" \n Name of Employee: "+name+" \n Department of Employee: "+dept);
		System.out.println(address);
	}
}
