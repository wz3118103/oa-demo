package com.wz.oa.organization.service;

import com.wz.oa.organization.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);
	
	public Employee findEmployeeById(Long id);
	
}
