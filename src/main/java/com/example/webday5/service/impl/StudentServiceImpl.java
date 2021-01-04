package com.example.webday5.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.webday5.model.Student;
import com.example.webday5.repository.StudentRepository;
import com.example.webday5.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	@Autowired
	public StudentServiceImpl(StudentRepository studentRepositoryJPA) {
		this.studentRepository = studentRepositoryJPA;
	}

	@Override
	@Transactional
	public void insert(Student s) {
		studentRepository.insert(s);
	}

}
