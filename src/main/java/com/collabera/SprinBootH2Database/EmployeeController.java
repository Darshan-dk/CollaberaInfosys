package com.collabera.SprinBootH2Database;

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
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@PostMapping("/add")
	public Employee addEmployee(@ModelAttribute Employee employee) {

		Employee emp = repository.save(employee);
		return emp;

	}

	@GetMapping("/")
	public List<Employee> listOfUser() {
		return repository.findAll();
	}

	@PutMapping(value="/employee",consumes = { "multipart/form-data" } 	)
	public Employee updateUser(@ModelAttribute Employee user) {
		user = repository.save(user);
		return user;
	}

	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Employee id) {
		repository.delete(id);
		return "record has been deleted successfully from h2 database " + id;
	}

}


