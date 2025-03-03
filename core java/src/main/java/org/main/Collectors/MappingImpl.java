package org.main.Collectors;

import org.main.Utility.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MappingImpl {


    public static void main(String[] args) {
        List<Employee> employeeList = new Employee().getEmployeeList();

       List<String> employeeNames = employeeList.stream().collect(
               Collectors.mapping(e->e.getEmployee_name(), Collectors.toList()));
        System.out.println(employeeNames);

       // [satwik, parvathi, Sreshta, Sahana, Siddartha, gowthama, gowthami, gowthami]


        Set<String> employeeNamesSet = employeeList.stream().collect(
                Collectors.mapping(e->e.getEmployee_name(), Collectors.toSet()));
        System.out.println(employeeNamesSet);

        //[gowthama, Sahana, satwik, Sreshta, gowthami, parvathi, Siddartha]

//        Map<String, String> collect = employeeList.stream().collect(Collectors.mapping(
//                e -> e.getEmployee_name(), Collectors.toMap(Function.identity(), Function.identity())
//        ));
//
//        System.out.println(collect);

    }
}
