package com.luv2code.springboot.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruddemoApplication {

	/*
		Development Process - 1
		1-EmployeeDAO(X), EmployeeDAOImpl(X)
		2-Extend JpaRepository interface
		3-Use Repository in app
	 */



	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
}
