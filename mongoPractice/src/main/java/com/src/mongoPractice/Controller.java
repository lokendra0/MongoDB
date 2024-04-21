package com.src.mongoPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private Repo repo;
	@GetMapping("/")
	public  StudentModel add(@RequestBody StudentModel studentModel) {
		return repo.save(studentModel);
		
	}
}
