package com.keshu12345.SpringBootRestCRUD.service;

import com.keshu12345.SpringBootRestCRUD.entity.Employee;

import java.util.List;


public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(Integer employeeId);
    Employee save(Employee theEmployee);
    void deleteById(Integer employeeId);
}
