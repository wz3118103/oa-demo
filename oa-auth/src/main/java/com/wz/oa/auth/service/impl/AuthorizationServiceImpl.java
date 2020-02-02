package com.wz.oa.auth.service.impl;

import com.wz.oa.auth.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wz.oa.auth.mapper.AuthorizationMapper;
import com.wz.oa.auth.model.Authorization;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

	@Autowired
	private AuthorizationMapper authorizationMapper;
	
	public void authorize(Authorization auth) {
		authorizationMapper.authorize(auth); 
	}

	public void unauthorize(Long id) {
		authorizationMapper.unauthorize(id); 
	}

	public Authorization findById(Long id) {
		return authorizationMapper.findById(id);
	}

}
