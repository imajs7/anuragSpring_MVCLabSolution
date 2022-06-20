package com.springfest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springfest.dao.StudentDao;
import com.springfest.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	@Override
	public Student findStudentById(Integer studentId) {
		return studentDao.getStudentById(studentId);
	}

	@Override
	public List<Student> findAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	public Student deleteStudent(Integer studentId) {
		return studentDao.deleteStudent(studentId);
	}

}
