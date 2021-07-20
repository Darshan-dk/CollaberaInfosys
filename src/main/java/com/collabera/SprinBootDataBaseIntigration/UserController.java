package com.collabera.SprinBootDataBaseIntigration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/")
	public List<Employee> listOfUser() {
		return userRepository.findAll();
	}

	@PostMapping(value="/add",consumes = { "multipart/form-data" })
	public Employee addUser(@ModelAttribute Employee user) {
		user = userRepository.save(user);
		return user;
	}

	@PutMapping("/employee")
	public Employee updateUser(@RequestBody Employee user) {
		user = userRepository.save(user);
		return user;
	}

	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Employee id) {
		userRepository.delete(id);
		return "record has been deleted successfully " + id;
	}

	@GetMapping({ "/{id}", "/show" })
	// PathVariable is used to pass value from URI and part of spring example
	// http://localhost:9090/2
	// @RequestParam is used to read(encoded) the HTML form data provided by a user
	// and bind it to the
	// request parameter http://localhost:9090?id=2
	// @PathParam and @QueryParam is used to URI(REST only) and part of JAX-RS
	public Employee getOneUser(@PathVariable(value = "id", required = false, name = "id") Long id) {
		return userRepository.findById(id).get();
	}

	@GetMapping("/users/")
	public Employee getUserDetails(@RequestParam(value = "uname", required = true) Long uname) {

		return userRepository.findById(uname).get();
	}

}
