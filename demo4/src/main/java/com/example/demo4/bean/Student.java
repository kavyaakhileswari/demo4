package com.example.demo4.bean;

public class Student {
	private Long id;
	private String fname;
	private String lname;
	
	
	public Student() {
		super();
	}
	public Student(long id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
}
