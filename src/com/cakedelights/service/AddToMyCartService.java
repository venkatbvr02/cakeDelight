package com.cakedelights.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakedelights.dao.AddToCartDAO;
import com.cakedelights.dto.AddToCartDTO;
@Service
public class AddToMyCartService {
	@Autowired
	private AddToCartDAO addToCartDAO;
	public String addingCartService(AddToCartDTO dto)
	{
		addToCartDAO.addingToCart(dto);
				return "Item has been succefully added to the cartto the user";
		
	}
	
	public Integer getmycartCounter(String username)
	{
		Integer rowcount=addToCartDAO.getmycartCount(username);
		return rowcount;
		
	}
	
	public List<AddToCartDTO> getDetailedcartReport(String username)
	{
		
		List<AddToCartDTO> counterDetailsList=addToCartDAO.getDetailedCounter(username);
		return counterDetailsList;
	}
}
