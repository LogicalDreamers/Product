package com.example.contoller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ProductNotFound;
import com.example.model.Product;
import com.example.serviceimpl.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	ProductServiceImpl product_service;
	
	@GetMapping("/")
	public String test()
	{
		return "Product...";
	}
	
	@PostMapping("/add")
	public  String add(@RequestBody Product sch)
	{
		return product_service.addProduct(sch);
	}

	@GetMapping("/gets")
	public @ResponseBody List<Product> gets()
	{
		 return product_service.getProduct();
	}
	@GetMapping("/get/{id}")
	public Product test(@PathVariable(value = "id") int id)throws ProductNotFound
	{
		System.out.println("Controller "+id);
		return product_service.findProduct(id);
	}
	// test PathParam and Request Parm
	//http://localhost:9092/srno/1001/receipts?date=2017-12-05
	@GetMapping(value="/srno/{orderId}/receipts")
	
	public String listUsersInvoices(@PathVariable("orderId") int order,
						@RequestParam(value = "date", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOrNull) 
	{
		System.out.println(dateOrNull);
		return "order "+order+" "+dateOrNull;
	
	}	
}
