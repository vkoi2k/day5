package com.example.webday5.repository.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webday5.model.Student;
import com.example.webday5.repository.StudentRepository;

@Repository
public class StudentRepositoryJPA implements StudentRepository {

	private EntityManager em;

	@Autowired
	public StudentRepositoryJPA(EntityManager em) {
		this.em = em;
	}

	@Override
	public void insert(Student s) {
		em.persist(s);
	}

}
