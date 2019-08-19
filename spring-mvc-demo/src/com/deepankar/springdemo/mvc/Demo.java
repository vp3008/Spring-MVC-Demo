package com.deepankar.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo 
{
	@RequestMapping("/myMenu")
	public String showMyForm()
	{
		return "my-menu";
	}
}
