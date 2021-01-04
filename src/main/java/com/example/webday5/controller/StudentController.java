package com.example.webday5.controller;

import java.text.DateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday5.dto.StudentDTO;
import com.example.webday5.model.Student;
import com.example.webday5.service.StudentService;
import com.example.webday5.transform.StudentTransform;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private DateFormat dateFormat;
	

//	@Autowired
//	public StudentController(StudentService studentService, DateFormat dateFormat) {
//		this.studentService = studentService;
//		this.dateFormat = dateFormat;
//	}

	@PostMapping
	public Student insertStudent(@RequestBody StudentDTO studentDTO) {
		StudentTransform transform = new StudentTransform(dateFormat);
		Student student = transform.apply(studentDTO);
		studentService.insert(student);
		return student;
	}
	
}
