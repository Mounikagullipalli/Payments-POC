package com.org.tcs.service;

import com.org.tcs.model.Payment;
import com.org.tcs.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentRepo paymentRepo;
    @Override
    public void addPayment(Payment payment) {
        paymentRepo.save(payment);
    }
    @Override
    public Optional<Payment> getById(Integer paymentNumber) {
        Optional<Payment> j= paymentRepo.findById(paymentNumber);
        return j;
    }
    @Override
    public void updatePayment(Payment payment) {

        paymentRepo.save(payment);
    }
    @Override
    public String deleteById(Integer paymentNumber) {
         paymentRepo.deleteById(paymentNumber);
        return "sucesfully";
    }
    @Override
    public List<Payment> getAll() {
     return paymentRepo.findAll();
    }
}
