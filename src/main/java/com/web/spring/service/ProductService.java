package com.web.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.web.spring.entitity.Product;

@Service
public class ProductService {

	
	public List<Product> plist=new ArrayList<>();
	
	public ProductService() {
        plist.add(new Product(1, "Cookies", 20.5f, 2));
        plist.add(new Product(2, "KitKat", 100.2f, 4));
        plist.add(new Product(3, "Lays", 80.0f, 4));
        plist.add(new Product(4, "CupCake", 200.4f, 5));
    }
	
	public List<Product> getProducts(){
		
		return plist;
	}
	
	public void addProducts(Product product) {
		
		plist.add(product);
	}
}
