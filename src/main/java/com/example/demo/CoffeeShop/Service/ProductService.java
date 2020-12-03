package com.example.demo.CoffeeShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CoffeeShop.Model.Products;
import com.example.demo.CoffeeShop.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Products> listAllUser() {
        return productRepository.findAll();
    }
	
	
	public Products get(int id) {
        return productRepository.findById(id).get();
    }
	
	     
	
	
	

}
