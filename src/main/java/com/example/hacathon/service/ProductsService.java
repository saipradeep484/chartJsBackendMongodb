package com.example.hacathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hacathon.model.Products;
import com.example.hacathon.repository.ProductsRepo;

@Service
public class ProductsService {
    @Autowired ProductsRepo productsRepo;
    public List<Products> getAllProducts(){
        return productsRepo.findAll();
    }
}
