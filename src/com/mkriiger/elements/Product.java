package com.mkriiger.elements;

public class Product {

	private String name;
	private double price;
		
	public Product(String name, double preco) {
		this.name = name;
		this.price = preco;
	}
	
	public double getPreco() {
		return price;
	}
	
	
	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
