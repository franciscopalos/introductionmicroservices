package com.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author Francisco M. Palos
 *
 * Test to see how any microservice are registered in Eureka Server
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Microservicio01Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservicio01Application.class, args);
	}
}
