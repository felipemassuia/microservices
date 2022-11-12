package com.microservices.hrpayroll.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.hrpayroll.entities.Payment;
import com.microservices.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    private Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){

        logger.info("Ativando método de cálculo de pagamento");
        Payment payment = paymentService.getPayment(workerId, days);

        return ResponseEntity.ok(payment);
    }

}
