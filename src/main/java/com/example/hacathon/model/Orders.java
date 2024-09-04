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
    
   
    private Timestamp createdAt; private double totalPrice;

    // public int getCoustmerId() {
    //     return customerId;
    // }
    // public void setCoustmerId(int customerId) {
    //     this.customerId = customerId;
    // }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
    
}
