package com.example.hacathon.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hacathon.model.Customers;
import com.example.hacathon.service.CustomersService;

@RestController
@RequestMapping("/endpoint")
public class AllInOneController {

    @Autowired CustomersService customersService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public Customers postCustomers(@RequestBody Customers customers)
    {
        return customersService.saveCustomers(customers);
    }
    @GetMapping
    public List<Customers> getCustomers()
    {
        return customersService.findAllCustomers();
    }
    @GetMapping("{id}")
    public Optional<Customers> findByidCustomers(@PathVariable String id){
        return customersService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id)
    {
         customersService.deleteById(id);
    }
    
}
