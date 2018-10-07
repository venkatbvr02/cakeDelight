package com.cakedelights.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import common.Logger;

@Controller
public class Indexcontroller {
	private static final Logger logger = Logger.getLogger(Indexcontroller.class);

	@RequestMapping(value={"product.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String productpage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("product page opeining");

		return "product.html";
	}
	@RequestMapping(value={"contact.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String contactpage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("contact page opeining");

		return "contact.html";
	}
	
	@RequestMapping(value={"services.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String servicepage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("service page opeining");

		return "services.html";
	}
	@RequestMapping(value={"index.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String indexpage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("index page opeining");

		return "index.html";
	}
	@RequestMapping(value={"blog.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String blogpage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("blog page opeining");

		return "blog.html";
	}
	
	@RequestMapping(value={"cheesecakes.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String cheesecakespage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("cheese cake page opeining");

		return "cheesecakes.html";
	}
	@RequestMapping(value={"spongecakes.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String sponagecakespage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("sponage cake page opeining");

		return "spongecakes.html";
	}
	@RequestMapping(value={"swissroll.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String swisscakespage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("swiss roll page opeining");

		return "swissroll.html";
	}
	
	@RequestMapping(value={"buttercakes.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String buttercakespage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("butter cake page opeining");

		return "buttercakes.html";
	}
	@RequestMapping(value={"layercakes.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String layercakespage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("layer cake page opeining");

		return "layercakes.html";
	}
	@RequestMapping(value={"cupcakes.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String cupcakespage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("cup cake page opeining");

		return "cupcakes.html";
	}
	@RequestMapping(value={"fondantcakes.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String fondantcakespage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("fondant cake page opeining");

		return "foundantcakes.html";
	}
	@RequestMapping(value={"otherdesserts.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String otherdessertscakespage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("other desserts page opeining");

		return "otherdeserts.html";
	}
	
	
	
	@RequestMapping(value={"about.htm"}, method={RequestMethod.GET, RequestMethod.POST})
	public String aboutpage(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		logger.debug("about page opeining");

		return "about.html";
	}



}
