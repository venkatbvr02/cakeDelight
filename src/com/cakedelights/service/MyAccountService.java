package com.cakedelights.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakedelights.bo.RegisterBO;
import com.cakedelights.dao.RegisterDAO;
import com.cakedelights.dto.RegisterDTO;

@Service
public class MyAccountService {
	@Autowired
	private RegisterDAO dao;
	public String Register(RegisterDTO dto)
	{
		
		String usersname=dao.registerUser(dto);
		
		return "registration successfully done with"+usersname;
		
	}

}
