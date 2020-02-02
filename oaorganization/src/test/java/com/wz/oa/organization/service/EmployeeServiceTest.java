package com.wz.oa.organization.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wz.oa.organization.model.Employee;

@ContextConfiguration(locations = {"classpath:application-organization.xml"})
@RunWith(SpringJUnit4ClassRunner.class)  
public class EmployeeServiceTest {
	
	@Autowired  
	private EmployeeService employeeService;
	
	@Test
	public void testAddEmployee() {
		Employee employee = new Employee();
		employee.setName("李四");
		employee.setAge(36); 
		employeeService.addEmployee(employee); 
	}
	
}
