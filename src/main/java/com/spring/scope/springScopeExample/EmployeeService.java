package com.spring.scope.springScopeExample;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	public ApplicationContext сontext;

	@PostConstruct
	public void getBeanScopeDemo() {
		System.out.println("Employee Object Reference 1 is " + this.сontext.getBean(Employee.class));
		System.out.println("Employee Object Reference 2 is " + this.сontext.getBean(Employee.class));
	}
}
