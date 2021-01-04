package com.example.webday5.transform;

import java.text.DateFormat;
import java.text.ParseException;

import com.example.webday5.dto.StudentDTO;
import com.example.webday5.model.Student;

public class StudentTransform {

	private DateFormat dateFormat;

	public StudentTransform(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public Student apply(StudentDTO dto) {
		Student student = new Student();
		student.setName(dto.getName());
		try {
			student.setDob(dateFormat.parse(dto.getDob()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return student;
	}
}
