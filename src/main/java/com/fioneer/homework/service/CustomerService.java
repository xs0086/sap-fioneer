/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fioneer.homework.service;
import com.fioneer.homework.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import com.fioneer.homework.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service

public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    @Transactional
    public String createCustomer(Customer customer){
        if(!customerRepository.existsById(customer.getId())){
            Customer c=customerRepository.save(customer);
            if(c!=null){
                return "Customer is saved!";}
           return "Successfuly saved...";
       }else{
          return "Customer already exists in the database.";
       }
    
    }
}
