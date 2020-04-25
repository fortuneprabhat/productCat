package com.product.productCat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.productCat.model.Product;
import com.product.productCat.service.ProductService;

@RestController
public class APIController {

	@Autowired
	ProductService service;
	@GetMapping("/home")
	public String home() {
		return "<h1>home </h1>";
	}
	
	@PostMapping("/product")
	public void add(@RequestBody Product product) {
		service.save(product);
	}
	
	
	@GetMapping("/product")
	Iterable<Product> findByQuery(@RequestParam(value="name", required=false) String name
			,@RequestParam(value="brand", required=false) String brand
			,@RequestParam(value="color", required=false) String color){
		if(name!=null) {
			return service.findByName(name);
		}else if(brand!=null) {
			return service.findByBrand(brand);
		}else if(color!=null) {
			return service.findByColor(color);
		}
		return service.findAll();
	}
	
	
	
}
