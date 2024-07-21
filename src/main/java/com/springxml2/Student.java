package com.springxml2;

public class Student {

	private int id;
	private String studentName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("id setter method");
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("studentName setter method");
	}

	public void displayStudentInfo()
	{
		System.out.println("Student Name is : "+studentName+" and id is : "+id);
	}
}
