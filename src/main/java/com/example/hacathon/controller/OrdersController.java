package com.example.hacathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hacathon.model.Customers;
import com.example.hacathon.model.Orders;
import com.example.hacathon.service.CustomersService;
 import com.example.hacathon.service.OrdersService;

@RestController
 @RequestMapping("/fun")
public class OrdersController {
    public OrdersService ordersService;
    @Autowired CustomersService customersService;
     @Autowired public OrdersController(OrdersService ordersService){
    this.ordersService = ordersService;
   }
   
    @GetMapping("/customers")
    public java.util.List<Customers> getAllCustomers() {
        return customersService.getAllCustomers();
    }
    @GetMapping("/good")
    public double totalOrderSales(){
        return ordersService.calculateTotalSales();
    }
     @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/orders")
    public java.util.List<Orders> getAllOrders(){
        return ordersService.getAllMethods();
    }
    // @PostMapping
    //  public Customers addCustomer(@RequestBody Customers customer) {
    //     return customersService.saveCustomer(customer);
    // }

    
}
