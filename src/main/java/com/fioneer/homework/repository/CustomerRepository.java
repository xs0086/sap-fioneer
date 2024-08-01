/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fioneer.homework.repository;

import java.util.List;
import com.fioneer.homework.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


/**
 *
 * @author andre
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    public boolean existsById(int id);
    public Customer findByEmail(String email);
    public Customer save(Customer customer);
    @Override
    public void deleteAll();
    
    
}
