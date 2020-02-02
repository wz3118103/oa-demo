package com.wz.oa.flow.mapper;

import com.wz.oa.flow.model.Application;

public interface ApplicationMapper {
	
	public void create(Application app);
	
	public void delete(Long id);
	
	public Application findById(Long id);
	
}
