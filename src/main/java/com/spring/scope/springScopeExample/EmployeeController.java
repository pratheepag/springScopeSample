package com.spring.scope.springScopeExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
public class EmployeeController {
	
	@Autowired
    protected WebApplicationContext сontext;
	
	@RequestMapping("/requestScopeTest")
	public void requestScopeTest() {
		System.out.println("Employee Object Reference 1 is " + this.сontext.getBean(EmployeeRequest.class));
		System.out.println("Employee Object Reference 2 is " + this.сontext.getBean(EmployeeRequest.class));

	}
	@RequestMapping("/requestScopeTest1")
	public void requestScopeTest1() {
		System.out.println("Employee Object Reference 1 is " + this.сontext.getBean(EmployeeRequest.class));
	}
}
