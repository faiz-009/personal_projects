package com.management.employee.controller;

import com.management.employee.dto.EmployeeDTO;
import com.management.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * The class representing the controller layer of Employee related APIs. This controller handles HTTP requests related
 * to employee management, including retrieving, creating, and listing employees.
 */
@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    /**
     * Autowired instance of the Employee service. This service provides the business logic for managing employees.
     */
    @Autowired
    private EmployeeService employeeService;

    /**
     * API to create a new employee.
     *
     * @param employeeDTO the data transfer object containing employee details
     * @return the created EmployeeDTO
     */
    @PostMapping
    public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.saveEmployee(employeeDTO);
    }

    /**
     * API to retrieve a list of all employees.
     *
     * @return ResponseEntity containing a list of EmployeeDTOs
     */
    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }


    /**
     * API to retrieve an employee by their unique identifier (employeeId).
     *
     * @param employeeId the unique identifier of the employee to retrieve
     * @return ResponseEntity containing the EmployeeDTO if found, or a 404 Not Found response if not found
     */
    @GetMapping(path = "/{employeeId}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable(name = "employeeId") UUID employeeId) {
        EmployeeDTO employeeById = employeeService.getEmployeeById(employeeId);
        if (employeeById != null) {
            return ResponseEntity.ok(employeeById);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
