package org.main.Collectors;

import org.main.Utility.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class CountingMethod {

    public static void main(String[] args) {

        List<Employee> empList = new Employee().getEmployeeList();
       Long count =  empList.stream().collect(Collectors.counting());
        System.out.println("count of Employees is " +count);
    }



}
