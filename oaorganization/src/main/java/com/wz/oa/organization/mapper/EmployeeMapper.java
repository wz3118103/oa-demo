package com.wz.oa.organization.mapper;

import com.wz.oa.organization.model.Employee;

public interface EmployeeMapper {
	
	public void addEmployee(Employee employee);
	
	public Employee findEmployeeById(Long id);
	
}
