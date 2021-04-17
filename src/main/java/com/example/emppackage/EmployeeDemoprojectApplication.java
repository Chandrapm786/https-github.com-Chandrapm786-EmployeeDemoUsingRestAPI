package com.example.emppackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeDemoprojectApplication {

	public static void main(String[] args) {
		System.out.println("***********************************************");
		System.out.println("Before I call main run");
		System.out.println("***********************************************");

		SpringApplication.run(EmployeeDemoprojectApplication.class, args);

		System.out.println("***********************************************");
		System.out.println("After I call main run");
		System.out.println("***********************************************");
	}

}
