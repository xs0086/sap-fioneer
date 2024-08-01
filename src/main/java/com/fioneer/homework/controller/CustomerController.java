/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fioneer.homework.controller;


import com.fioneer.homework.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fioneer.homework.service.CustomerService;

/**
 *
 * @author andre
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="createcustomer",method=RequestMethod.POST)
    public String createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }
}
