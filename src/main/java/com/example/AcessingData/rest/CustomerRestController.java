package com.example.AcessingData.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AcessingData.entity.CustomerEntity;
import com.example.AcessingData.repository.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	@Autowired
	CustomerRepository repository;
	
	@GetMapping(value = "/customers", produces = "application/json")
	public Iterable<CustomerEntity> getAll(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/customers/{id}", produces = "application/json")
	public Optional<CustomerEntity> getbyId(@PathVariable Long id){
		return repository.findById(id);
	}
	
	@DeleteMapping(value = "/customers")
	public void deleteAll() {
		repository.deleteAll();
	}
	
}
