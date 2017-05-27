package com.curso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MicroserviceController {
	
	@HystrixCommand (fallbackMethod="gestionarenvio")
	@RequestMapping(value="/identificador", method=RequestMethod.GET)
	public String getIdentifier(Integer id){
		return "Nuevo identificador" + java.util.UUID.randomUUID();
	}

}
