package com.bridgelabz.EmployeePayrollApp.service;



import com.bridgelabz.EmployeePayrollApp.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayrollApp.model.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee addEmployee(EmployeeDTO emp);
    Employee updateEmployee(Long id, EmployeeDTO emp);
    void deleteEmployee(Long id);
}