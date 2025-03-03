package org.main.Utility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private long employee_id;
    private String employee_name;
    private long employee_age;
    private BigDecimal phone_number;
    private String email_address;
    private String Department;

    public Employee(long employee_id, String employee_name, long employee_age, BigDecimal phone_number, String email_address, String department) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_age = employee_age;
        this.phone_number = phone_number;
        this.email_address = email_address;
        Department = department;
    }

    public Employee() {
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public long getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(long employee_age) {
        this.employee_age = employee_age;
    }

    public BigDecimal getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(BigDecimal phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }


    public List<Employee> getEmployeeList(){

        List<Employee> empList = new ArrayList<>();

        Employee e1 = new Employee(1,"satwik",30,
                new BigDecimal(868091),"satwik.smg@gmail.com","IT");
        Employee e2 = new Employee(2,"parvathi",30,
                new BigDecimal(868092),"parvathi.smg@gmail.com","IT2");
        Employee e3 = new Employee(3,"Sreshta",33,
                new BigDecimal(868093),"Sreshta.smg@gmail.com","IT3");
        Employee e4 = new Employee(4,"Sahana",30,
                new BigDecimal(868092),"Sahana.smg@gmail.com","IT4");
        Employee e5 = new Employee(5,"Siddartha",35,
                new BigDecimal(868092),"Siddartha.smg@gmail.com","IT5");
        Employee e6 = new Employee(6,"gowthama",36,
                new BigDecimal(868092),"gowthama.smg@gmail.com","IT6");
        Employee e7 = new Employee(7,"gowthami",30,
                new BigDecimal(868092),"gowthami.smg@gmail.com","IT7");
        Employee e8 = new Employee(7,"gowthami",30,
                new BigDecimal(868092),"gowthami.smg@gmail.com","IT7");
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);

        return empList;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_age=" + employee_age +
                ", phone_number=" + phone_number +
                ", email_address='" + email_address + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
