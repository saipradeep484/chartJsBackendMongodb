package com.example.hacathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hacathon.model.Products;

@Repository
public interface ProductsRepo extends JpaRepository<Products,Long>{

    
} 
