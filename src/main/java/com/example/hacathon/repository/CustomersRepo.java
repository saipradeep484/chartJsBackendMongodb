package com.example.hacathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hacathon.model.Customers;


public interface CustomersRepo extends JpaRepository<Customers,Long>{

    
} 
