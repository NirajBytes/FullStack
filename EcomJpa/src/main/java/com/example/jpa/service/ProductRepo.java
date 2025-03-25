package com.example.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.model.Product;

public interface ProductRepo extends JpaRepository<Product, String> {

}
