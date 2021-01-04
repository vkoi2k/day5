package com.example.webday5.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webday5.model.Subject;
import com.example.webday5.repository.SubjectRepository;
import com.example.webday5.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectRepository subjectRepositoryJPA;
	
	@Override
	@Transactional
	public void insert(Subject s) {
		subjectRepositoryJPA.insert(s);
	}
	
}
