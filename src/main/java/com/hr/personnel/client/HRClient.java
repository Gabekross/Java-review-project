package com.hr.personnel.client;

import com.hr.personnel.Employee;
import java.time.LocalDate;

public class HRClient {





  public static void main(String[] args) {

    //created an object and set the properties of the employee using setter methods
    Employee employee1 = new Employee();
    employee1.setName("Gabriel");
    employee1.setHireDate(LocalDate.of(2020,3,10));
    String employeeInfo1 = employee1.getEmployeeInfo();
    System.out.println("employee info = " + employeeInfo1);


    //Created an objet and set the propperties using a constructor
    Employee employee = new Employee("OLU", LocalDate.of(2021,5,3));
    String employeeInfo2 = employee.getEmployeeInfo();
    System.out.println("employee info = " + employeeInfo2);







  }

}
