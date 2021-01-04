package com.example.webday5.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webday5.model.Student;
import com.example.webday5.repository.StudentRepository;

@Repository
public class StudentRepositoryHibernate implements StudentRepository {

	private SessionFactory sessionFactory;

	@Autowired
	public StudentRepositoryHibernate(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insert(Student s) {
		Session session = sessionFactory.getCurrentSession();
		session.save(s);
	}

}
