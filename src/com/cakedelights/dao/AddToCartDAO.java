package com.cakedelights.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cakedelights.dto.AddToCartDTO;

import common.Logger;

@Repository
public class AddToCartDAO {
	private static Logger logger=Logger.getLogger(AddToCartDAO.class);
//	private static final String addtocart="insert into addingtocart values(?,?,?,?,?)";
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private SessionFactory sessionFactory;
	public String addingToCart(AddToCartDTO dto)
	{
		hibernateTemplate.save(dto);
		return "Added item successfully to the cart";
	}
	
	public Integer getmycartCount(String username)
	{
		logger.debug("In dao layer getting cart count");
		Integer rowcount=(Integer)sessionFactory.openSession().createCriteria(AddToCartDTO.class).setProjection(Projections.rowCount()).add(Restrictions.eq("username", username)).uniqueResult();

		logger.debug("my caret count is :::::"+rowcount); 
		
		return rowcount;
	}
	
	public List<AddToCartDTO> getDetailedCounter(String username)
	{
		logger.debug("In dao layer getting detailed counter ");
		List<AddToCartDTO> detailedcounterslist= sessionFactory.openSession().createCriteria(AddToCartDTO.class).add(Restrictions.eq("username", username)).list();
		logger.debug("Counter list details are ::::::::: "+detailedcounterslist); 
		return detailedcounterslist;
	}
}
