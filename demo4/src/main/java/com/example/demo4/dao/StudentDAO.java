package com.example.demo4.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo4.entity.StudentEntity;

public interface StudentDAO  extends CrudRepository<StudentEntity, Long>{

}