package com.curso.microservicio02.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservicio02.domain.Customer;
import com.curso.microservicio02.repository.CustomerRepository;

/**
 * 
 * @author Francisco M. Palos
 * Rest Controller that manage operations related to customer
 */
@RestController
@RequestMapping("/customer")
public class Microservice02Controller {
	
	
	private static final Logger log = LoggerFactory.getLogger(Microservice02Controller.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Customer getCustomerById(@RequestParam(value="id", required=true)long id){
		return customerRepository.findOne(id);
	}
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public @ResponseBody List<Customer> getAllCustomers(){
		return (List<Customer>)customerRepository.findAll();
	}
	@RequestMapping(method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.CREATED)
	public void setCustomer(@RequestBody(required=true) Customer customer){
		log.info("Save customer: " + customer.toString());
		customerRepository.save(customer);
	}

}
