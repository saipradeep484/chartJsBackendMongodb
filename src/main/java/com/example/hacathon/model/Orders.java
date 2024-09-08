package com.example.hacathon.model;

import java.sql.Timestamp;

import org.springframework.data.mongodb.core.mapping.Document;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

@Document(collation = "hacathon1")
public class Orders {
     @org.springframework.data.annotation.Id
   private String id;
    
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
