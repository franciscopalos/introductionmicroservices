package com.curso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MicroserviceController {
	
	
	@RequestMapping(value="/randomIdentifier", method=RequestMethod.GET)
	public String getIdentifier(Integer id){
		return "New identifier ->" + java.util.UUID.randomUUID();
	}

}
