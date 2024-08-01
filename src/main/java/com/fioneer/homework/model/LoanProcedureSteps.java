/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fioneer.homework.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;


import jakarta.persistence.ManyToOne;

/**
 *
 * @author andre
 */
@Entity
public class LoanProcedureSteps {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private int orderNumber;
    
    @Column(nullable = false)
    private int expectedDurationDays;
    
    @Column(nullable = false)
    private String status;
    
    @ManyToOne
    @JoinColumn(name = "loan_type_id")
    private LoanType loanType;

//    public LoanProcedureSteps() {
//    }
//
//    public LoanProcedureSteps(int id, String name, int orderNumber, int expectedDurationDays, String status,LoanType loanType) {
//        this.id = id;
//        this.name = name;
//        this.orderNumber = orderNumber;
//        this.expectedDurationDays = expectedDurationDays;
//        this.status = status;
//        this.loanType = loanType;
//    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getExpectedDurationDays() {
        return expectedDurationDays;
    }

    public void setExpectedDurationDays(int expectedDurationDays) {
        this.expectedDurationDays = expectedDurationDays;
    }

   


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }





   

    
    }

    

