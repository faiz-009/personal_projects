package com.management.employee.repository;

import com.management.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Repository interface for managing {@link Employee} entities. This interface extends {@link JpaRepository}, providing
 * CRUD operations and additional query methods for the Employee entity. The primary key type for the Employee entity is
 * UUID.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

}
