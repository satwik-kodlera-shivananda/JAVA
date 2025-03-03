package org.main.Collectors;

import org.main.Utility.Employee;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingByImpl {

    public static void main(String[] args) {

        List<Employee>  employeeList = new Employee().getEmployeeList();

       Map<Long, List<Employee>> groupbyResults = employeeList.stream().collect(Collectors.groupingBy(e->e.getEmployee_age()));
   //     System.out.println(groupbyResults);




//        {
//            33=[Employee{employee_id=3, employee_name='Sreshta', employee_age=33, phone_number=868093, email_address='Sreshta.smg@gmail.com', Department='IT3'}],
//        35=[Employee{employee_id=5, employee_name='Siddartha', employee_age=35, phone_number=868092, email_address='Siddartha.smg@gmail.com', Department='IT5'}],
//        36=[Employee{employee_id=6, employee_name='gowthama', employee_age=36, phone_number=868092, email_address='gowthama.smg@gmail.com', Department='IT6'}],
//       30=[Employee{employee_id=1, employee_name='satwik', employee_age=30, phone_number=868091, email_address='satwik.smg@gmail.com', Department='IT'},
//          Employee{employee_id=2, employee_name='parvathi', employee_age=30, phone_number=868092, email_address='parvathi.smg@gmail.com', Department='IT2'},
//          Employee{employee_id=4, employee_name='Sahana', employee_age=30, phone_number=868092, email_address='Sahana.smg@gmail.com', Department='IT4'},
//          Employee{employee_id=7, employee_name='gowthami', employee_age=30, phone_number=868092, email_address='gowthami.smg@gmail.com', Department='IT7'}]
//        }




        Map<Long, Set<Employee>> groupbyResults2   = employeeList.stream().collect(Collectors.groupingBy(e->e.getEmployee_age(), Collectors.toSet()));
        System.out.println(groupbyResults2);


//        {33=[Employee{employee_id=3, employee_name='Sreshta', employee_age=33, phone_number=868093, email_address='Sreshta.smg@gmail.com', Department='IT3'}],
//        35=[Employee{employee_id=5, employee_name='Siddartha', employee_age=35, phone_number=868092, email_address='Siddartha.smg@gmail.com', Department='IT5'}],
//        36=[Employee{employee_id=6, employee_name='gowthama', employee_age=36, phone_number=868092, email_address='gowthama.smg@gmail.com', Department='IT6'}],
//        30=[Employee{employee_id=4, employee_name='Sahana', employee_age=30, phone_number=868092, email_address='Sahana.smg@gmail.com', Department='IT4'},
//           Employee{employee_id=1, employee_name='satwik', employee_age=30, phone_number=868091, email_address='satwik.smg@gmail.com', Department='IT'},
//           Employee{employee_id=7, employee_name='gowthami', employee_age=30, phone_number=868092, email_address='gowthami.smg@gmail.com', Department='IT7'},
//           Employee{employee_id=2, employee_name='parvathi', employee_age=30, phone_number=868092, email_address='parvathi.smg@gmail.com', Department='IT2'}]
//        }


//        {33=[Employee{employee_id=3, employee_name='Sreshta', employee_age=33, phone_number=868093, email_address='Sreshta.smg@gmail.com', Department='IT3'}],
//       35=[Employee{employee_id=5, employee_name='Siddartha', employee_age=35, phone_number=868092, email_address='Siddartha.smg@gmail.com', Department='IT5'}],
//       36=[Employee{employee_id=6, employee_name='gowthama', employee_age=36, phone_number=868092, email_address='gowthama.smg@gmail.com', Department='IT6'}],
//       30=[Employee{employee_id=4, employee_name='Sahana', employee_age=30, phone_number=868092, email_address='Sahana.smg@gmail.com', Department='IT4'},
//         Employee{employee_id=1, employee_name='satwik', employee_age=30, phone_number=868091, email_address='satwik.smg@gmail.com', Department='IT'},
//         Employee{employee_id=7, employee_name='gowthami', employee_age=30, phone_number=868092, email_address='gowthami.smg@gmail.com', Department='IT7'},
//         Employee{employee_id=2, employee_name='parvathi', employee_age=30, phone_number=868092, email_address='parvathi.smg@gmail.com', Department='IT2'},
//         Employee{employee_id=7, employee_name='gowthami', employee_age=30, phone_number=868092, email_address='gowthami.smg@gmail.com', Department='IT7'}]
//        }





    }
}
