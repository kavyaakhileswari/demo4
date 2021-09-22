package com.example.demo4.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo4.bean.Student;
import com.example.demo4.dao.StudentDAO;
import com.example.demo4.entity.StudentEntity;

@Service
public class StudentServiceImpl {

	@Autowired
	private StudentDAO studentDAO;

	public Collection<Student> getStudentDetails(){
		Iterable<StudentEntity> collec =studentDAO.findAll();
		List<Student> listStudent = new ArrayList<Student> ();
		for (StudentEntity studentEntity : collec) {
			Student student=new Student();
			BeanUtils.copyProperties(studentEntity, student);
			listStudent.add(student);
		}
		return listStudent;
	}
	
	public Student getStudentDetailByStudentId(long id){
		Student student =null;
		StudentEntity studentEntity= studentDAO.findOne(id);
		if(studentEntity!=null){
			student= new Student();
			BeanUtils.copyProperties(studentEntity, student);
		}
		return student;
	}
	
}
