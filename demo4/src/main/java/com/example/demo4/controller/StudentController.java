package com.example.demo4.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo4.bean.Student;
import com.example.demo4.service.StudentServiceImpl;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentService;
	
	
	
	@RequestMapping(value="student/controller/getDetails",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Student>> getStudentDetails(){
		Collection <Student> listStudent = studentService.getStudentDetails();
		System.out.println(listStudent);
		return new ResponseEntity<Collection<Student>>(listStudent, HttpStatus.OK);
	}
	
	@RequestMapping(value="student/controller/getDetailsById/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getStudentDetailByStudentId(@PathVariable("id") long myId){
		Student student = studentService.getStudentDetailByStudentId(myId);
		
		if(student!=null)
		{
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
}

