package com.springfest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springfest.model.Student;

@Repository
public class StudentDao {

	@Autowired
	private HibernateTemplate hTemplate;
	
	public List<Student> getAllStudents(){
		return this.hTemplate.loadAll(Student.class);
	}
	
	public Student getStudentById(int studentId) {
		return this.hTemplate.get(Student.class, studentId);
	}
	
	@Transactional
	public Student saveStudent(Student student) {
		this.hTemplate.saveOrUpdate(student);
		return student;
	}
	
	@Transactional
	public Student deleteStudent(int studentId) {
		Student student = this.hTemplate.load(Student.class, studentId);
		this.hTemplate.delete(student);
		return student;
	}
	
}
