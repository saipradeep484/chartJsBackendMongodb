package com.example.hacathon.repository;


// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.hacathon.model.Orders;
@Repository
public interface OrdersRepo  extends MongoRepository<Orders,String>{
  
}
