package com.example.webday5.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.webday5.model.Subject;
import com.example.webday5.repository.SubjectRepository;

@Repository
public class SubjectRepositoryJdbc implements SubjectRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(Subject s) {
		jdbcTemplate.update("Insert into subject (subject_name) values (?)",s.getName());
		
	}
	
}
