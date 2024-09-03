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
    private int coustmerId;
    private double totalPrice;
    private Timestamp createdAt;

    public int getCoustmerId() {
        return coustmerId;
    }
    public void setCoustmerId(int coustmerId) {
        this.coustmerId = coustmerId;
    }
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
