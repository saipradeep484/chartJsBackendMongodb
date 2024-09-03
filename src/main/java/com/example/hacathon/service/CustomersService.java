
package com.example.hacathon.service;

import com.example.hacathon.model.Customers;
import com.example.hacathon.repository.CustomersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersService {

    @Autowired
    private CustomersRepo customersRepo;

    // Method to retrieve all customers
    public List<Customers> getAllCustomers() {
        return customersRepo.findAll();
    }

    // public Customers saveCustomer(Customers customer) {
    //     return customersRepo.save(customer);
    // }
}
