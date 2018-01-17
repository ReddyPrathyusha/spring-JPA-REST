package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.branch.BranchController;


@ComponentScan(basePackageClasses = BranchController.class)

@SpringBootApplication
public class CollegeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeDemoApplication.class, args);
	}
}
