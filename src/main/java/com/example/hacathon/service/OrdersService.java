package com.example.hacathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hacathon.model.Orders;
import com.example.hacathon.repository.OrdersRepo;

@Service
public class OrdersService {
    @Autowired  OrdersRepo ordersRepo;

    public double calculateTotalSales() {
        List<Orders> orders = ordersRepo.findAll();
        return orders.stream()
                     .mapToDouble(Orders::getTotalPrice)
                     .sum();
       // return 99.99;
    }
    public List<Orders> getAllMethods()
    {
        return ordersRepo.findAll();
    }
  
}
