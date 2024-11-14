package com.management.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

/**
 * Data Transfer Object (DTO) for Employee. This class is used to transfer employee data between different layers of the
 * application.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {

    /**
     * Unique identifier for the employee. This is a UUID that uniquely identifies each employee in the system.
     */
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
