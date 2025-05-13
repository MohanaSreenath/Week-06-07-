package net.srikaran.springboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name;
    private String designation;
    
    // Injecting the Department bean via Constructor Injection
    private Department department;

    // Constructor Injection
    @Autowired
    public Employee(Department department) {
        this.name = "John Doe";
        this.designation = "Software Engineer";
        this.department = department;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
        department.displayDepartmentInfo();
    }
}
