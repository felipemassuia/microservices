package com.microservices.hrpayroll.entities;

public class Worker {

    private Long id;
    private String name;
    private double dailyIncome;

    public Worker(Long id, String name, double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public Worker(){
        
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDailyIncome() {
        return dailyIncome;
    }
    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

}
