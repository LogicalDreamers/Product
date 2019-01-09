package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductDao;
import com.example.exception.ProductNotFound;
import com.example.model.Product;
import com.example.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao productdao;

	@Override
	public String addProduct(Product sch) {
		
		return productdao.save(sch).getName()+"is added";
	}

	@Override
	public List<Product> getProduct() 
	{
		return productdao.findAll();
	}

	@Override
	public Product findProduct(int sch_id) throws ProductNotFound
	{
		if(productdao.existsById(sch_id))
				return productdao.findById(sch_id).get();
		else
			throw new ProductNotFound("Not Found");
	}
	

}
