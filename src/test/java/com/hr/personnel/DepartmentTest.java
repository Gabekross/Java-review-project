package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DepartmentTest {

  private Department department;

  private SalariedEmployee joe;
  @Before
  public void setUp() throws Exception {

    department = new Department("engineering", "boston");
    joe = new SalariedEmployee("joe",
        LocalDate.of(2020,03,04),3000);
  }




  @Test
  public void addEmployee_should_increase_currentIndex_by_1() {
    int currentIndexBeforeAddingNewEmployee = department.getCurrentIndex();
    department.addEmployee(joe);
    int currentIndexAfterAddingNewEmployee = department.getCurrentIndex();
    Assertions.assertThat(currentIndexAfterAddingNewEmployee)
        .isEqualTo(currentIndexBeforeAddingNewEmployee +1);



  }
}