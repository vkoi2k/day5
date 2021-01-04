package com.example.webday5.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.webday5.model.Student;
import com.example.webday5.repository.StudentRepository;

@Repository
public class StudentRepositoryJdbc implements StudentRepository {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public StudentRepositoryJdbc(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student s) {
		jdbcTemplate.update("INSERT INTO STUDENT (STUDENT_NAME, STUDENT_DOB) VALUES (?, ?)", s.getName(), s.getDob());
	}

}
