package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {


  private HourlyEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee = new HourlyEmployee("sang",
        LocalDate.of(2020, 03, 23),
        10.0,
        200);
  }

  @Test
  public void computeMonthlyCompensation_should_return_valid_result() {
    assertEquals(employee.computeMonthlyCompensation(), 2000.0, 0.01);
  }

  @Test
  public void getEmployeeInfo_should_return_valid_info_on_SalariedEmployee() {

    assertEquals("name = sang, hireDate = 2020-03-23, hourlyRate = 10.0, hoursWorkedPerMonth = 200",
        employee.getEmployeeInfo());
  }

//  @Test
//  public void computeMonthlyCompensation_should_return_multiplication_of_hourlyRate_and_hours() {
//
//    HourlyEmployee olu = new HourlyEmployee
//        ("olu", LocalDate.of(2020,3,3),
//            10,200);
//
//
//    double monthlyCompensation = olu.computeMonthlyCompensation();
//    Assertions.assertThat(monthlyCompensation).isEqualTo(2000);
//  }


}