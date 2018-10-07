package com.cakedelights.dao;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cakedelights.dto.LoginDTO;
import com.cakedelights.dto.RegisterDTO;

@Repository
public class LoginDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	SessionFactory sessionFactory;
	public Integer login(LoginDTO lbo)
	{
		Integer rowcount=(Integer)sessionFactory.openSession().createCriteria(RegisterDTO.class).setProjection(Projections.rowCount()).add(Restrictions.eq("username", lbo.getUsername())).uniqueResult();
		System.out.println("list is :::::::::::::::;; "+rowcount);
		return rowcount;
	}

}
