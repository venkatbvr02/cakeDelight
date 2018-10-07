package com.cakedelights.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakedelights.dao.LoginDAO;
import com.cakedelights.dto.LoginDTO;

@Service
public class LoginService {
	@Autowired
	private LoginDAO dao;
	public Integer login(LoginDTO dto)
	{
		Integer out=dao.login(dto);
		return out;
	}

}
