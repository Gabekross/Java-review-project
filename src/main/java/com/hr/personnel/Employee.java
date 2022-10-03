package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public abstract class Employee implements TaxPayer {

  private String name;
  private LocalDate hireDate;


  public Employee() {
  }

  public Employee(String name, LocalDate hireDate) {
    this.name = name;
    this.hireDate = hireDate;
  }


  //Method
  public String getEmployeeInfo(){

    return "name = " + name +
        " , hireDate = " +hireDate;
  }
  //Method
  public String work(){

    return name + "worked ";
  }

  public abstract double computeMonthlyCompensation();


//TODO
  // If current year is 2022 and the year of hireDate is
// 2020, it returns 2
//  public int computeNumberOfYearsWorkedSinceHired() {
//
//
//    // add code here - do not use deprecated method
//  }

  //Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }
}
