package com.microservices.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.hrpayroll.entities.Payment;
import com.microservices.hrpayroll.entities.Worker;
import com.microservices.hrpayroll.feignclients.WorkerFeignClient;
import com.microservices.hrpayroll.services.exceptions.ObjectNotFoundException;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;


    public Payment getPayment(long id, int days){
        
        Worker worker = workerFeignClient.findById(id).getBody();

        if(worker == null){
            throw new ObjectNotFoundException("Object not found");
        }
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
