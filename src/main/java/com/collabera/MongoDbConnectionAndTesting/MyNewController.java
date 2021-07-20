package com.collabera.MongoDbConnectionAndTesting;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyNewController {
	@Autowired
 private MongoDBCustomerService repository;
	

	@GetMapping("/")
	public List<Student> listOfUser() {
		return repository.findAll();
	}

	@PostMapping(value="/add")
	public Student addUser(@ModelAttribute Student user) {
		user = repository.save(user);
		return user;
	}

	@PutMapping(value="/student",consumes = { "multipart/form-data" } 	)
	public Student updateUser(@ModelAttribute Student user) {
		user = repository.save(user);
		return user;
	}

	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Student id) {
		repository.delete(id);
		return "record has been deleted successfully " + id;
	}

}

