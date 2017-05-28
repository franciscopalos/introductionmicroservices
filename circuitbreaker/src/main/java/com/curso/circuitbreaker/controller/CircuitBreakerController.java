package com.curso.circuitbreaker.controller;

import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class CircuitBreakerController {

	@HystrixCommand(fallbackMethod="helloFallback")
	@RequestMapping(value="sayHello", method= RequestMethod.GET)
	public @ResponseBody String sayHello(@RequestParam (value="name", required=false) String name){
		Assert.notNull(name, "Name not valid");
		return "Hello " + name;
	}
	
	public @ResponseBody String helloFallback(String name){
		return " Hello Unknown Man. You´re little naughty";
	}
}
