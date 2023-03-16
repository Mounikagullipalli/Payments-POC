package com.org.tcs.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Payment {
    @Id
    private int paymentNumber;
    private String paymentName;
    private double balance;
    private String address;

}
