package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.ModelLogin;

@Controller
public class MainController 
{
	@RequestMapping(value="/login")
	public String hello(ModelMap m) 
	{
		ModelLogin m1=new ModelLogin();
		m.addAttribute("std",m1);
		return "login";
		
	}
	@RequestMapping(value="/check",method=RequestMethod.POST)
	public String saveData(@Validated @ModelAttribute("std")ModelLogin m2,BindingResult result,ModelMap m1)
	{
		String finalResult;
		if(result.hasErrors())
		{
			finalResult="login";
		}
		else
		{
			m1.addAttribute("std1",m2);
			finalResult= "success";
		}
		return finalResult;
	}
}
