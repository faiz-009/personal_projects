package com.management.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

/**
 * Represents an Employee entity in the employee management system. This class is mapped to the "employee" table in the
 * database and contains fields that represent the properties of an employee.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "employee")
public class Employee {

    /**
     * Unique identifier for the employee. This field is automatically generated using UUID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID employeeId;

    /**
     * The name of the employee. This field holds the full name of the employee.
     */
    private String name;

    /**
     * The email address of the employee. This field is used for communication and must follow standard email format.
     */
    private String email;

    /**
     * The phone number of the employee. This field stores the employee's contact number. It is represented as a long to
     * accommodate various formats.
     */
    private long phoneNumber;
}
