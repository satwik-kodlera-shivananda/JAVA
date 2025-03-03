package org.main.Collectors;

import org.main.Utility.Employee;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReducingImpl {



    public static void main(String[] args) {
        List<Employee> emplist = new Employee().getEmployeeList();
        Optional<Employee> collect = emplist.stream().collect(
                Collectors.reducing(
                        (a, b) -> a.getEmployee_age() > b.getEmployee_age() ? a : b)
            );

        System.out.println("Elder employee is " +collect.get());

      Employee youngEmployee =  emplist.stream().collect(
                Collectors.reducing(
                        (a, b) -> a.getEmployee_age() > b.getEmployee_age() ? b : a)
        ).get();
        System.out.println("young Employee is "+ youngEmployee);


    }
}
