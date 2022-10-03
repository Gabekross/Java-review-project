package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class SalariedEmployeeTest {


  private SalariedEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee = new SalariedEmployee("olu",
        LocalDate.of(2020, 01, 1),
        2000.0);
  }

  @Test
  public void computeMonthlyCompensation_should_return_monthly_salary() {

    double monthlySalary = employee.computeMonthlyCompensation();
    Assertions.assertThat(monthlySalary).isEqualTo(20000);

  }
  @Test
  public void getEmployeeInfo_should_return_valid_employee_info() {

    assertEquals("name = sang, hireDate = 2020-05-23, monthlySalary = 1000.0",
        employee.getEmployeeInfo());
  }



}