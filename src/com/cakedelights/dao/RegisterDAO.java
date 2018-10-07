package com.cakedelights.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cakedelights.bo.RegisterBO;
import com.cakedelights.dto.RegisterDTO;

@Repository
public class RegisterDAO {
	private static final String registration="insert into registrationdetails values(?,?,?,?)";
	@Autowired
	HibernateTemplate ht;
	@Autowired
	SessionFactory factory;
	public String registerUser(RegisterDTO bo)
	{
		 ht.save(bo);
		return "registration succesfull";
		
	}

}
