package com.example.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
@RequestMapping("/dash")
public String dashboard()
{
	return "dashboard";
}
@RequestMapping("/addProd")
public String addProduct() 
{
	return "addProduct";
}
}
