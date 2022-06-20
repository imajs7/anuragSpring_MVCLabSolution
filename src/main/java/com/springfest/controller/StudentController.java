package com.springfest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springfest.model.Student;
import com.springfest.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/home")
	public String getHome() {
		return "redirect:/";
	}

	@RequestMapping("/")
	public String getAllStudents(Model model) {
		List<Student> allStudents = studentService.findAllStudents();
		model.addAttribute("students", allStudents);
		System.out.println(allStudents.toString());
		return "student-list";
	}
	
	@RequestMapping("/addstudent")
	public String addNewStudent(Model theModel) {
		Student student = new Student();
		theModel.addAttribute("student", student);
		return "add-student";
	}
	
	@RequestMapping("/edit/{id}")
	public String editStudent(@PathVariable("id") int studentId, Model model) {
		Student student = studentService.findStudentById(studentId);
		model.addAttribute("student", student);
		return "add-student";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student) {
		studentService.saveStudent(student);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") int studentId) {
		studentService.deleteStudent(studentId);
		return "redirect:/";
	}
	
}
