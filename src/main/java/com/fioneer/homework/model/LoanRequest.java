/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fioneer.homework.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;

/**
 *
 * @author andre
 */
@Entity
public class LoanRequest {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "LOAN_TYPE_ID")
    private LoanType loanType;
    
    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
    
    
    private double loanAmount;
      private int totalExpectedDurationDays;
    private Date dateOfRequest;
    
    
    private String status;

    public LoanRequest() {
    }

    public LoanRequest(Long id, LoanType loanType, Customer customer, Employee employee, double loanAmount, int totalExpectedDurationDays, Date dateOfRequest, String status) {
        this.id = id;
        this.loanType = loanType;
        this.customer = customer;
        this.employee = employee;
        this.loanAmount = loanAmount;
        this.totalExpectedDurationDays = totalExpectedDurationDays;
        this.dateOfRequest = dateOfRequest;
        this.status = status;
    }

   

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getTotalExpectedDurationDays() {
        return totalExpectedDurationDays;
    }

    public void setTotalExpectedDurationDays(int totalExpectedDurationDays) {
        this.totalExpectedDurationDays = totalExpectedDurationDays;
    }

    public Date getDateOfRequest() {
        return dateOfRequest;
    }

    public void setDateOfRequest(Date dateOfRequest) {
        this.dateOfRequest = dateOfRequest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
  
    
    
}
