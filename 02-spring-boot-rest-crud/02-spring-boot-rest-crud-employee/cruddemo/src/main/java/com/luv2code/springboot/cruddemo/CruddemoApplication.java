package com.luv2code.springboot.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruddemoApplication {

	/*
		Development Process - 1

		1-Update db configs in application.properties
		2-Create Employee entity
		3-Create DAO interface
		4-Create DAO implementation
		5-Create Rest controller to use DAO

		Development Process - 2

		1-Set up Database Dev Environment
		2-Create Spring Boot project using Spring Initializr
		3-Get list of employees
		4-Get Single employee by ID
		5-Add a new employee
		6-Update an existing employee
		7-Delete an existing employee
	 */



	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
}
