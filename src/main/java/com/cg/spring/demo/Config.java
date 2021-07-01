package com.cg.spring.demo;

import org.springframework.context.annotation.Bean;

/**
 * 
 * @author Gaurav
 *
 */
public class Config {

	@Bean
	public Employee employee() {
		System.out.println("Employee bean");
		return new Employee();
	}

}
