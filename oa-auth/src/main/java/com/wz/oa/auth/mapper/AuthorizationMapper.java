package com.wz.oa.auth.mapper;

import com.wz.oa.auth.model.Authorization;

public interface AuthorizationMapper {
	
	public void authorize(Authorization auth);
	
	public void unauthorize(Long id);
	
	public Authorization findById(Long id);
	
}
