package com.bank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.model.Customer;
import com.bank.service.LoginService;


@Controller
public class HomeController {

@Autowired
private LoginService loginService;


@RequestMapping(value="/bank", params="login", method=RequestMethod.GET)
public String showLoginForm(){
	return "/user/login";
}

@RequestMapping(value="verify", method=RequestMethod.POST)
public String verifyLogin(@RequestParam String userName, @RequestParam String pwd,
		HttpSession session, Model model)
{
	System.out.println("inside login post ");

	int loginId =  loginService.loginCustomer(userName, pwd);
	System.out.println("loginId "+loginId);
	if(loginId == 0)
	{
		model.addAttribute("loggedInUser","Error logging In. Please enter valid credentials!!");
		return "/user/login";
	}
	session.setAttribute("loggedInUserId", loginId);
	return "/user/home";
}
	
@RequestMapping(value="/bank", params="registration" )
public String createRegisterForm()
{
	return  "/user/registration";
}

@RequestMapping(value="register", method=RequestMethod.POST)
public String saveCustomer(Customer customer)
{
	return "/user/success";
}

@RequestMapping(value="/logout", method=RequestMethod.GET)
public String logout(HttpSession session)
{
	session.removeAttribute("loggedInUser");
	return "/user/login";	
}


}
