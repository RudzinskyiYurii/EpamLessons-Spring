package com.example.demo;

public class Student {

	private long id;
	private String firstName;
	private String lastName;
	
	
	
	public Student(int id, String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
