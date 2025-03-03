package org.main.Collectors;

import org.main.Utility.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxndMin {

    //check max and min value with duplicate values

    public static void main(String[] args) {

        List<Employee> employeeList = new Employee().getEmployeeList();

        Optional<Employee> collect = employeeList.stream().collect(Collectors.maxBy(
         Comparator.comparingLong(Employee::getEmployee_age)  )  );

     //   System.out.println(collect.get());

        Optional<Employee> collectmin = employeeList.stream().collect(Collectors.minBy(
                Comparator.comparingLong(Employee::getEmployee_age)  )  );

        System.out.println(collectmin.get());
    }
}
