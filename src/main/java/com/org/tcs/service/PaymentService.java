package com.org.tcs.service;

import com.org.tcs.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    public void addPayment( Payment payment);
    public Optional<Payment> getById(Integer paymentNumber);
    public void updatePayment( Payment payment);
    public String deleteById(Integer paymentNumber);
    public List<Payment> getAll();
}
