package com.product.productCat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@NotBlank
	@JsonProperty
	String name;
	@NotBlank
	@JsonProperty
	String brand;
	@JsonProperty
	int price;
	@NotBlank
	@JsonProperty
	String color;
	@NotBlank
	@JsonProperty
	String size;
	@NotBlank
	@JsonProperty
	String sku;
	@JsonProperty
	int avaiableCount;
	
	public Product() {
	}

	public Product(int id, @NotBlank String name, @NotBlank String brand, @NotBlank int price, @NotBlank String color,
			@NotBlank String size, @NotBlank String sku, @NotBlank int avaiableCount) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.sku = sku;
		this.avaiableCount = avaiableCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String isSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getAvaiableCount() {
		return avaiableCount;
	}

	public void setAvaiableCount(int avaiableCount) {
		this.avaiableCount = avaiableCount;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", color=" + color
				+ ", size=" + size + ", sku=" + sku + ", avaiableCount=" + avaiableCount + "]";
	}	
	
	
}
