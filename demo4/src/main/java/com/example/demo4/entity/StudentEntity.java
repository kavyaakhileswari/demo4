package com.example.demo4.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String fname;
	private String lname;
	
	public StudentEntity() {
		super();
	}

	public StudentEntity(Long id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		return "StudentEntity [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
}
