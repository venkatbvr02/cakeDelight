package com.cakedelights.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cakedelights.dto.AddToCartDTO;
import com.cakedelights.externalmap.ExternalMap;
import com.cakedelights.service.AddToMyCartService;

import common.Logger;

@Controller
public class AddToCartController {
	@Autowired
	private AddToMyCartService addToMyCartService;
	public static final Logger logger=Logger.getLogger(AddToCartController.class);
	
	@RequestMapping(value={"addtocart.htm"}, method={RequestMethod.POST})
	public @ResponseBody String addproduct(@RequestParam("productname") String productName, @RequestParam("productdesc") String productdesc,HttpSession session)
	{
		logger.debug("coming to add to cart controller");
//		String username=(String)session.getAttribute("username");
		String userName=ExternalMap.getInstance().get("username");
//		String username="venugopal450@gmail.com";
		logger.debug("add to cart item is ::: "+productName+" :::: String username :::::: "+productdesc+"::::::: username ::: "+userName);
		AddToCartDTO addToCartDTO=new AddToCartDTO();
		addToCartDTO.setDoc(new Date(System.currentTimeMillis()));
		addToCartDTO.setProductDescription(productdesc);
		addToCartDTO.setProductName(productName);
		addToCartDTO.setUsername(userName);
		
		addToMyCartService.addingCartService(addToCartDTO);
		return "product added Successfully";
		
	}
	@RequestMapping(value={"mycart.htm"}, method={RequestMethod.POST})
	public @ResponseBody String  mycartcount()
	{
		String username=ExternalMap.getInstance().get("username");
		Integer rowcount=addToMyCartService.getmycartCounter(username);
		logger.debug(" String username::::::::: "+username);
		return rowcount.toString();		
	}
	
	@RequestMapping(value={"mycartDetails.htm"}, method={RequestMethod.GET})
	public @ResponseBody List<AddToCartDTO> mycartDetails()
	{
		String username=ExternalMap.getInstance().get("username");
		
		logger.debug("Username is :::::: "+username);
		List<AddToCartDTO> detailedcounterList=addToMyCartService.getDetailedcartReport(username);
		return detailedcounterList;
		
		
		
	}
}
