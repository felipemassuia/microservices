package com.microservices.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.microservices.hrpayroll.entities.Payment;

@Service
public class PaymentService {
    
    public Payment getPayment(long id, int days){
        
        return new Payment("Ana", 200.00, days);
    }

}
