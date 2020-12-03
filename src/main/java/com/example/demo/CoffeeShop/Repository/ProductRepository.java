package com.example.demo.CoffeeShop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CoffeeShop.Model.Products;



@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

}
