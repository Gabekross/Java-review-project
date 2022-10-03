package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

public class HRClient {




  public static void main(String[] args) {

//    //created an object and set the properties of the employee using setter methods
//    Employee employee1 = new Employee();
//    employee1.setName("Gabriel");
//    employee1.setHireDate(LocalDate.of(2020,3,10));
//    String employeeInfo1 = employee1.getEmployeeInfo();
//    System.out.println("employee info = " + employeeInfo1);
//
//
//    //Created an objet and set the propperties using a constructor
//    Employee employee = new Employee("OLU", LocalDate.of(2021,5,3));
//    String employeeInfo2 = employee.getEmployeeInfo();
//    System.out.println("employee info = " + employeeInfo2);

    Employee employee1 = new SalariedEmployee("joe",
        LocalDate.of(2010, 12, 12),
        2000.0);
    String employeeInfo1 = employee1.getEmployeeInfo();
    System.out.println(employeeInfo1);

    Employee employee2
        = new SalariedEmployee("maria",
        LocalDate.of(2020, 02, 12),
        3000.0);
    String employeeInfo2 = employee2.getEmployeeInfo();
    System.out.println(employeeInfo2);

    Employee employee3
        = new HourlyEmployee("dave",
        LocalDate.of(2021, 03, 23),
        10.0, 100);
    String employeeInfo3 = employee3.getEmployeeInfo();
    System.out.println(employeeInfo3);

    Department department = new Department("marketing", "boston");
    department.addEmployee(employee1);
    department.addEmployee(employee2);
    department.addEmployee(employee3);
    int numberOfEmployeesWhoWorked
        = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
    System.out.println("number of employees who worked = " +
        numberOfEmployeesWhoWorked);


    double totalMonthlyCompensation =department.computeDepartmentMonthlyTotalCompensation();
    System.out.println("department total monthly compensation = " + totalMonthlyCompensation);


  }

}
