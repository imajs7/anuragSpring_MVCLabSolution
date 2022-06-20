package com.springfest.service;

import java.util.List;

import com.springfest.model.Student;


public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student findStudentById(Integer studentId);
	public List<Student> findAllStudents();
	public Student deleteStudent(Integer studentId);

}
