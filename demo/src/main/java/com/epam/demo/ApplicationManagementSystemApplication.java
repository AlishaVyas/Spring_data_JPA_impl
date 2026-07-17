package com.epam.demo;

import com.epam.demo.repository.ApplicantCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationManagementSystemApplication {
    @Autowired
    private ApplicantCrudRepository applicantCrudRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApplicationManagementSystemApplication.class, args);
	}

}
