package com.example.webday5.repository.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webday5.model.Subject;
import com.example.webday5.repository.SubjectRepository;

@Repository
public class SubjectRepositoryJPA implements SubjectRepository{

	@Autowired
	private EntityManager em;
	
	@Override
	public void insert(Subject s) {
		em.persist(s);	
	}

}
