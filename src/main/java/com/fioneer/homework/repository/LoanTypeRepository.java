/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fioneer.homework.repository;

import com.fioneer.homework.model.Customer;
import com.fioneer.homework.model.LoanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andre
 */
@Repository
public interface LoanTypeRepository extends JpaRepository<LoanType, Integer>{
     public boolean existsById(int id);
    public LoanType findById(int id);
    public LoanType save(LoanType loanType);
    public LoanType findByName(String name);
}
