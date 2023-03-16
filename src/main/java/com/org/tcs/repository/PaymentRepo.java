package com.org.tcs.repository;

import com.org.tcs.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Integer> {


}

