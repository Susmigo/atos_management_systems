package com.atos.management.systems.atos_management_systems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atos.management.systems.atos_management_systems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
