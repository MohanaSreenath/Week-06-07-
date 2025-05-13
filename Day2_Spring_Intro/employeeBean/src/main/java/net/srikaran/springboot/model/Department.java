package net.srikaran.springboot.model;

import org.springframework.stereotype.Component;

@Component
public class Department {

    private String departmentName;

    // Constructor
    public Department() {
        this.departmentName = "IT";
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + departmentName);
    }
}

