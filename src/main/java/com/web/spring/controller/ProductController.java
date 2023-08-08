package com.web.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.entitity.Product;
import com.web.spring.service.ProductService;

@Controller
@RequestMapping(value = "/productapi")
public class ProductController {

	@Autowired
	ProductService service;
	
	//productapi/getproducts
	@GetMapping(value = "/getproducts")
	public String getProducts(Model model){
		List<Product> getProducts= service.getProducts();
		model.addAttribute("products",getProducts);
		//model.addAttribute("newproducts", new Product());
		return "producttable";
		
	}
}
