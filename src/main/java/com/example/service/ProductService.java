package com.example.service;

import java.util.List;

import com.example.exception.ProductNotFound;
import com.example.model.Product;

public interface ProductService {

	public String addProduct(Product sch);
	public List<Product> getProduct();
	public Product findProduct(int sch_id) throws ProductNotFound;
}
