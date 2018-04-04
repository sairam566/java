package com.indus;

public class Address {
	private String steet,city,state,country;

	public Address(String steet, String city, String state, String country) {
		super();
		this.steet = steet;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public  String toString()
	{
		return "Street name: "+steet+" \n City name: "+city+" \n State name: "+state+" \n Country name: "+country;
	}

}
