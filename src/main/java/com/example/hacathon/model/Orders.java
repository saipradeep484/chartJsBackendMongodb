package com.example.hacathon.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // private int customerId;
    
   private String months;
     private double totalPrice;

    
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
   
    public String getMonth() {
        return months;
    }
    public void setMonth(String months) {
        this.months = months;
    }
    
}
