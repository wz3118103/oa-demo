package com.wz.oa.flow.service.impl;

import com.wz.oa.flow.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wz.oa.flow.mapper.ApplicationMapper;
import com.wz.oa.flow.model.Application;

@Service("applicationService") 
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationMapper applicationMapper;
	
	public void create(Application app) {
		applicationMapper.create(app); 
	}

	public void delete(Long id) {
		applicationMapper.delete(id); 
	}

	public Application findById(Long id) {
		return applicationMapper.findById(id);
	}
	
}
