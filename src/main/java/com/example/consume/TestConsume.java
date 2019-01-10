package com.example.consume;

import org.springframework.web.client.RestTemplate;

import com.example.model.Product;

public class TestConsume {

	private static 	RestTemplate restTemplate=new RestTemplate();
	
	public static void main(String[] args)
	{
		getByID(5);
	}

	private static void getByID(int i) {
		
		Product p=restTemplate.getForObject("http://localhost:9094/get/"+i,Product.class);
		System.out.println("GET Cumsume  "+p);

	/*private static void addProduct(Product product) 
	{
		Product result = restTemplate.postForObject("http://localhost:9094/add",product,Product.class);
		System.out.println("Counsume POST "+result);
	}*/
}
