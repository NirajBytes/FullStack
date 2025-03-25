package com.example.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.jpa.model.Product;
import com.example.jpa.service.ProductRepo;

@Controller
public class ProductController {
@Autowired
ProductRepo prepo;
@RequestMapping("/addProdProcess")
public String addProductProcess(@RequestParam("prodid")String pid,@RequestParam("prodname")String name,@RequestParam("category")String category,@RequestParam("qty")String qty,@RequestParam("price")String price,ModelMap model) {
	Product prod = new Product();
	prod.setId(pid);
	prod.setName(name);
	prod.setCategory(category);
	prod.setQuantity(Integer.parseInt(qty));
	prod.setPrice(Double.parseDouble(price));
	prepo.save(prod);
	model.put("msg", "Product added sucessfully");
	return "addProduct";
}
@GetMapping("/prod")
public String getAllProduct(Model model) {
	
	List<Product> prod = prepo.findAll();
	model.addAttribute("product", prod);
	return "dashboard"; 
}
}
