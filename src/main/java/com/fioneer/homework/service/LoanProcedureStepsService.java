/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fioneer.homework.service;


import com.fioneer.homework.model.LoanProcedureSteps;

import com.fioneer.homework.repository.LoanProcedureStepsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class LoanProcedureStepsService {
    @Autowired
    private LoanProcedureStepsRepository loanProcedureStepsRepository;
    
    @Transactional
    public String createProcedureStep(LoanProcedureSteps loanstep){ 
// Check if a procedure step with the given ID already exists in the database        
        if(!loanProcedureStepsRepository.existsById(loanstep.getId())){  
            // Save the new procedure step to the database
            LoanProcedureSteps lps=loanProcedureStepsRepository.save(loanstep);
            if(lps!=null){
                // Return success message if the save operation was successful
                return "Procedure step is saved!";}
         
       }
// Return a message indicating the procedure step already exists
          return "Step already exists in the database.";
       
    
    }
}
