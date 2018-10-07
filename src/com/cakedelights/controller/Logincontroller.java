package com.cakedelights.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cakedelights.dto.LoginDTO;
import com.cakedelights.dto.RegisterDTO;
import com.cakedelights.externalmap.ExternalMap;
import com.cakedelights.service.LoginService;
import com.cakedelights.service.MyAccountService;
import com.cakedelights.vo.LoginVO;
import com.cakedelights.vo.RegisterVO;

import common.Logger;

@Controller
public class Logincontroller {
	@Autowired
	private MyAccountService myAccountService;
	@Autowired
	private LoginService loginService;
	// @Autowired
	// public RegisterDTO dto;
	//// private static final String registration="insert into
	//// registrationdetails values(?,?,?,?)";
	// Connection conn;
	// PreparedStatement ps1,ps2;
	private static final Logger logger = Logger.getLogger(Logincontroller.class);

	@RequestMapping(value = { "home.htm" }, method = { RequestMethod.GET, RequestMethod.POST })
	public String Homepageopen(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		logger.debug("Home page Opening...");
		return "index.html";

	}

	@RequestMapping(value = { "signin.htm" }, method = { RequestMethod.GET, RequestMethod.POST })
	public String signinpage(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		logger.debug("sign in page opening..");

		return "signin.html";

	}

	@RequestMapping(value = { "myaccount.htm" }, method = { RequestMethod.GET, RequestMethod.POST })
	public String myaccount(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		logger.debug("myaccount in page opening..");
		return "signup.html";

	}

	@RequestMapping(value = { "login.htm" }, method = { RequestMethod.POST })
	public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// public String login(org.springframework.ui.Model
		// model,@ModelAttribute("loginbo")LoginVO vo)
		// {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		logger.debug("coming to login check deatils.." + username + "::: pass word::: " + password);
		LoginDTO dto = new LoginDTO();
		dto.setUsername(username);
		dto.setPassword(password);
		Integer result = loginService.login(dto);
		if (result == 1) {
			session.setAttribute("username", username);
			ExternalMap.getInstance().add("username", username);
			return "index.html";
		} else {
			return "signin.html";
		}
		// String username=request.getParameter("name");
		// String password=request.getParameter("password");
		// logger.debug("username is::: "+username+":::: password is ::::
		// "+password);

		// TO DO db calls
		// return "index.html";

	}

	@RequestMapping(value = { "signup.htm" }, method = { RequestMethod.POST })
	// public String login(HttpServletRequest request, HttpServletResponse
	// response, HttpSession session) {
	public String signup(org.springframework.ui.Model model, @ModelAttribute("registerbo") RegisterVO vo,
			HttpSession session) {
		// logger.debug("coming to sign up check deatils.."+vo.toString());

		RegisterDTO dto = new RegisterDTO();
		dto.setEmail(vo.getEmail());
		dto.setUsername(vo.getUsername());
		dto.setPassword(vo.getPassword());
		dto.setConfPassword(vo.getConfPassword());
		String result = myAccountService.Register(dto);
		logger.debug("after service layer call:::" + result);
		model.addAttribute("result", result);
		return "signup.html";
		// // TO DO db calls
		// String username = request.getParameter("username");
		// String email=request.getParameter("email");
		// String password=request.getParameter("password");
		// String confirmpassword=request.getParameter("confirmpassword");
		// logger.debug("username is "+username+":: email is ;;;;"+email+":::
		// password::: "+password);
		// try
		// {
		// ps1=conn.prepareStatement(registration);
		// ps1.setString(1,email);
		// ps1.setString(2, username);
		// ps1.setString(3, password);
		// ps1.setString(4, confirmpassword);
		// if(password.equals(confirmpassword))
		// ps1.execute();
		// else
		// System.out.println("Login failed");
		// }
		// catch(Exception e)
		// {
		// System.err.println(e.getMessage());
		// }
		// use serviceclass
		// String result=service.Register(dto);
		// return "index.html";

	}

}
