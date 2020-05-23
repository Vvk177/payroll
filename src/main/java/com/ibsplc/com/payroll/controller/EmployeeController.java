package com.ibsplc.com.payroll.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibsplc.com.payroll.model.Employee;
import com.ibsplc.com.payroll.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	private final EmployeeRepository repository;

	public EmployeeController(EmployeeRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/employees")
	List<Employee> all() {
		return repository.findAll();

	}

	@GetMapping("/")
	List<Employee> fetchAll() {
		return repository.findAll();

	}

	@PostMapping("/employee/create")
	Employee saveRecord(@RequestBody Employee emp) {
		return repository.save(emp);
	}

	@PutMapping("/employee/update/{eid}")
	Employee updateRecord(@RequestBody Employee emp) {
		return repository.save(emp);
	}

	@DeleteMapping("/employee/delete/{eid}")
	void deleteRecord(@PathVariable int eid) {
		repository.deleteById(eid);
	}
}
