package com.wz.oa.organization.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wz.oa.organization.mapper.EmployeeMapper;
import com.wz.oa.organization.model.Employee;
import com.wz.oa.organization.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	public void addEmployee(Employee employee) {
		employeeMapper.addEmployee(employee); 
	}

	public Employee findEmployeeById(Long id) {
		return employeeMapper.findEmployeeById(id);
	}

}
