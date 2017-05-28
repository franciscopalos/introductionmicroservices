package com.curso.microservicio02.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.curso.microservicio02.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	public List<Customer> findByLastName(String lastName);

}
