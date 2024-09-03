package com.example.hacathon.repository;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hacathon.model.Orders;
@Repository
public interface OrdersRepo  extends JpaRepository<Orders,Long>{
//List<Orders> findAll();
    
}
