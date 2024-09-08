
package com.example.hacathon.service;

import com.example.hacathon.model.Customers;
import com.example.hacathon.repository.CustomersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomersService {

    @Autowired
    private CustomersRepo customersRepo;

   
   public Customers saveCustomers(Customers customers)
   {
    return customersRepo.save(customers);
   }
        // Method to retrieve all customers
    public List<Customers> findAllCustomers(){
        return customersRepo.findAll();
    }
    public Optional<Customers> findById(String s1){
        return customersRepo.findById(s1);
    }
    public void deleteById(String s2){
        customersRepo.deleteById(s2);
    }
}
