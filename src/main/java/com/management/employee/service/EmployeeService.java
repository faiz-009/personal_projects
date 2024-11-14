package com.management.employee.service;

import com.management.employee.dto.EmployeeDTO;
import com.management.employee.model.Employee;
import com.management.employee.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * The service layer for handling operations related to Employee entities. This class provides methods to retrieve,
 * save, and manage Employee data.
 */
@Service
@Slf4j
public class EmployeeService {

    /**
     * The repository for managing Employee entities. This is automatically injected by Spring.
     */
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * The ModelMapper instance used for mapping between Employee and EmployeeDTO.
     */
    private final ModelMapper modelMapper = new ModelMapper();

    /**
     * Saves a new Employee to the database.
     *
     * @param employeeDTO the DTO object containing employee details to be saved
     * @return the DTO object of the saved employee, including the generated employeeId
     */
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = this.modelMapper.map(employeeDTO, Employee.class);

        Employee savedEmployee = this.employeeRepository.save(employee);
        employeeDTO.setEmployeeId(savedEmployee.getEmployeeId());
        return employeeDTO;
    }

    /**
     * Retrieves all Employees from the database.
     *
     * @return a list of EmployeeDTOs representing all employees
     */
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employeeList = this.employeeRepository.findAll();

        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        employeeList.forEach(employee -> employeeDTOList.add(this.modelMapper.map(employee, EmployeeDTO.class)));

        return employeeDTOList;
    }

    /**
     * Retrieves an Employee by its unique identifier.
     *
     * @param employeeId the UUID of the employee to be retrieved
     * @return an EmployeeDTO representing the employee if found, otherwise null
     */
    public EmployeeDTO getEmployeeById(UUID employeeId) {
        Optional<Employee> employee = this.employeeRepository.findById(employeeId);
        return employee.map(value -> this.modelMapper.map(value, EmployeeDTO.class)).orElse(null);
    }
}
