package com.example.Employee.employee;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence")
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String employeeRole;
    private LocalDate created_at;

    public Employee() {
    }

    public Employee(Long id, String name, String email, String phoneNumber, String employeeRole, LocalDate created_at) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.employeeRole = employeeRole;
        this.created_at = created_at;
    }

    public Employee(String name,
                    String email,
                    String phoneNumber,
                    String employeeRole,
                    LocalDate created_at) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.employeeRole = employeeRole;
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", employeeRole='" + employeeRole + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
