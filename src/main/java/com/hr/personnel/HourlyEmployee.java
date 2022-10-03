package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

  private int hoursWorkedPerMonth;
  double hourlyRate;


  public HourlyEmployee(String name , LocalDate hireDate) {
  super(name, hireDate);
  }

  public HourlyEmployee(String name, LocalDate hireDate, double hourlyRate, int hoursWorkedPerMonth) {

   super(name, hireDate);
    this.hourlyRate = hourlyRate;
    this.hoursWorkedPerMonth = hoursWorkedPerMonth;
  }



  public double computeMonthlyCompensation() {
    return hourlyRate * hoursWorkedPerMonth ;
  }
  public int getHoursWorkedPerMonth() {
    return hoursWorkedPerMonth;
  }

  public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
    this.hoursWorkedPerMonth = hoursWorkedPerMonth;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }
}
