package com.example.hacathon.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.hacathon.model.Customers;


public interface CustomersRepo extends MongoRepository<Customers,String>{

    
} 
