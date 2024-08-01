/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fioneer.homework.controller;

import com.fioneer.homework.model.LoanProcedureSteps;
import com.fioneer.homework.model.LoanType;
import com.fioneer.homework.service.LoanProcedureStepsService;
import com.fioneer.homework.service.LoanTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andre
 */
@RestController
public class LoanProcedureStepsControleer {
    @Autowired
    private LoanProcedureStepsService loanProcedureStepsService;
    
   @RequestMapping(value="createprocedurestep",method=RequestMethod.POST)
   public String createStep(@RequestBody LoanProcedureSteps lps){
       return loanProcedureStepsService.createProcedureStep(lps);
   }
}
