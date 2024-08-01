/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fioneer.homework.controller;

import com.fioneer.homework.model.Customer;
import com.fioneer.homework.model.LoanType;
import com.fioneer.homework.service.CustomerService;
import com.fioneer.homework.service.LoanTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andre
 */
@RestController
public class LoanTypeController {
    
    //loanTypeService field is being automatically injected with an instance of the LoanTypeService
    @Autowired
    private LoanTypeService loanTypeService;
    
    
//    Handles the HTTP POST request for creating a new loan type.
// 
//  This method is mapped to the URL path "/createloan" and is triggered 
//  when a POST request is made to this path. The method expects a 
//  LoanType object in the request body, which represents the details of 
//  the loan type to be created.
    @RequestMapping(value="createloan",method=RequestMethod.POST)
    public String createLoan(@RequestBody LoanType lt){
        return loanTypeService.createLoan(lt);
    }
    
    @RequestMapping(value="findloan",method=RequestMethod.GET)
    public LoanType getLoanByName(@RequestBody String name){
        return loanTypeService.getLoanByName(name);
    }
    @RequestMapping(value="total_expected_duration_of_loan",method=RequestMethod.GET)
    public int getTotalExpectedDuration(@RequestBody int id) {
        return loanTypeService.calculateTotalExpectedDuration(id);
    }
     
    @RequestMapping(value="loan_details",method=RequestMethod.GET)
    public LoanType getLoanTypeDetails(@RequestBody int id) {
        return loanTypeService.getLoanTypeDetails(id);
    }
}

