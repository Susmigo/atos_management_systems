package com.atos.management.systems.atos_management_systems.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.atos.management.systems.atos_management_systems.entity.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Employee> findPaginated(int pageNo,int pageSize, String sortField, String sortDirection);
}
