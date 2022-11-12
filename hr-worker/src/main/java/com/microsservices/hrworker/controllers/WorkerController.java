package com.microsservices.hrworker.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsservices.hrworker.entities.Worker;
import com.microsservices.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
    
    private Logger logger = LoggerFactory.getLogger(WorkerController.class);
    
    @Autowired
    WorkerRepository repository;

    @GetMapping
    ResponseEntity<List<Worker>> findAll(){

        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id){

        logger.info("Ativando método de worker");
        Worker obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}
