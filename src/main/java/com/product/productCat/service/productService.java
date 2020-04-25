package com.product.productCat.service;

import org.springframework.data.repository.CrudRepository;

import com.product.productCat.model.Product;

public interface ProductService extends CrudRepository<Product, Integer>{
	Iterable<Product> findByName(String name);
	Iterable<Product> findByBrand(String brand);
	Iterable<Product> findByColor(String color);
	Iterable<Product> findBySize(String size);
	Iterable<Product> findBySku(String sku);
}
