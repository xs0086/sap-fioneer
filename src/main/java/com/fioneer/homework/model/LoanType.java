/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fioneer.homework.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import java.util.ArrayList;



/**
 *
 * @author andre
 */
@Entity     //meaning this class will be treated as a database table which it is
public class LoanType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //used for indicating that id is used as a primary key with auto increment configuration
    private int loan_type_id;
    
    @Column(unique = true, nullable = false)
    private String name;
    
    @Column
    private String description;
    
    @OneToMany(mappedBy = "loanType")
    private ArrayList<LoanProcedureSteps> procedure=new ArrayList<>();

//    public LoanType() {
//    }
//
//    public LoanType(int id, String name, String description,ArrayList<LoanProcedureSteps> procedure) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.procedure=procedure;
//    }

    public int getLoan_type_id() {
        return loan_type_id;
    }

    public void setLoan_type_id(int loan_type_id) {
        this.loan_type_id = loan_type_id;
    }

  



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<LoanProcedureSteps> getProcedure() {
        return procedure;
    }

    public void setProcedure(ArrayList<LoanProcedureSteps> procedure) {
        this.procedure = procedure;
    }
    
    
}
