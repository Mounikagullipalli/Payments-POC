package com.org.tcs.controller;


import com.org.tcs.model.Payment;
import com.org.tcs.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    @GetMapping("/getAll")
    public List<Payment> getAll(){
        List<Payment> opt = paymentService.getAll();
        return opt;
    }
    @DeleteMapping("/deleteBy/{paymentNumber}")
    public String deleteById(@PathVariable Integer paymentNumber){
        String s = paymentService.deleteById(paymentNumber);
        return s;
    }
    @PutMapping("/update")
    public void updatePayment(@RequestBody Payment payment){

        paymentService.updatePayment(payment);
    }
   @GetMapping("/getById/{paymentNumber}")
    public Optional<Payment> getById(@PathVariable Integer paymentNumber){
      Optional<Payment> p=  paymentService.getById(paymentNumber);
      return p;
    }
    @PostMapping("/create")
    public void addPayment(@RequestBody Payment payment) {
        paymentService.addPayment(payment);
    }
}


