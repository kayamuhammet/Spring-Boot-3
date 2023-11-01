package com.luv2code.springboot.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruddemoApplication {

	/*
		Development Process - 1

		1- Add Spring Data Rest to POM file
		2- restcontroller (x), service (x)
		3- Spring Data REST just adds an "s" to the entity (JpaResository<Employee, Integer>)
		    -localhost:8080/employees
		4- @RepositoryRestResource
		5- Sample Configuration
		    -spring.data.rest.base-path=/magic-api etc.

	 */



	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
}
