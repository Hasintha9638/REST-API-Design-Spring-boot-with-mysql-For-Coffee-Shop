package com.example.demo.CoffeeShop.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CoffeeShop.Model.Orders;
import com.example.demo.CoffeeShop.Repository.OrderRepository;

@Service
public class OrderService {
	
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Orders save(Orders orders) {
        return orderRepository.save(orders);
    }
	
	public Orders get(int id) {
        return orderRepository.findById(id).get();
    }
	public void delete(int id) {
        orderRepository.deleteById(id);
	}

}
