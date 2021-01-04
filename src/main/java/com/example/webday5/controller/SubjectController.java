package com.example.webday5.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday5.model.Subject;
import com.example.webday5.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
	@Autowired
	private SubjectService subjectService;

//	@PostMapping
//	public Subject insertSubject(@RequestBody Subject subject) {
//		subjectService.insert(subject);
//		return subject;
//	}
	
	@PostMapping
	public Subject insert(@RequestBody String name) {
		Subject s = new Subject();
		s.setName(name);
		subjectService.insert(s);
		return s;
	}
}
