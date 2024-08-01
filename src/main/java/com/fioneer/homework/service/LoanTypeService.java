/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fioneer.homework.service;

import com.fioneer.homework.model.Customer;
import com.fioneer.homework.model.LoanProcedureSteps;
import com.fioneer.homework.model.LoanType;
import com.fioneer.homework.repository.CustomerRepository;
import com.fioneer.homework.repository.LoanProcedureStepsRepository;
import com.fioneer.homework.repository.LoanTypeRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class LoanTypeService {
    @Autowired
    private LoanTypeRepository loanTypeRepository;
    
    @Autowired
    private LoanProcedureStepsRepository loanProcedureStepsRepository;
    
    
    
//    These methods are transactional, ensuring that the operation is atomic and that 
//  any changes made within the method are either fully completed or fully rolled back 
//  in case of an error.
    
    @Transactional
    public String createLoan(LoanType loanType){
        if(!loanTypeRepository.existsById(loanType.getLoan_type_id())){
            if(!loanType.getProcedure().isEmpty()){
                for (LoanProcedureSteps loanProcedureSteps : loanType.getProcedure()) {
                    loanProcedureSteps.setLoanType(loanType); // Set the back-reference
                    LoanProcedureSteps lps = loanProcedureStepsRepository.save(loanProcedureSteps);
                    if(lps!=null){
                        System.out.println("Uspesno sacuvane svi koraci");
                    }else{
                        System.out.println("Greska pri cuvanju koraka");
                    }
                }
            }else{
                System.out.println("Niste uneli ni jedan korak u proceduri");
            }
            LoanType  lt =loanTypeRepository.save(loanType);
            if(lt!=null){
                return "Loan type is saved!";}
           return "Saved successfuly...";
       }else{
          return "Loan typealready exists in the database.";
       }}
        
        @Transactional
        public LoanType getLoanByName(String name){
            //finds loan type that matches the name sent as a parameter
            return loanTypeRepository.findByName(name);
    }
        @Transactional
        public int calculateTotalExpectedDuration(int loanTypeId){
            // Retrieve the LoanType object for the given loanTypeId
             LoanType loanType = loanTypeRepository.findById(loanTypeId);
             // Check if the loan type exists in the database
                if(loanType==null){
                    // Return 0 if the loan type does not exist
                    return 0;
                }
        // Calculate and return the sum of expected duration days for all procedure steps
             return loanType.getProcedure().stream()
                .mapToInt(LoanProcedureSteps::getExpectedDurationDays)
                .sum();
                
            }
        @Transactional
        public LoanType getLoanTypeDetails(int id) {
       // Retrieve and return the LoanType object for the given ID from the repository
        return loanTypeRepository.findById(id);
    }

}

