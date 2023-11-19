package com.keshu12345.SpringBootRestCRUD.dao;

import com.keshu12345.SpringBootRestCRUD.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>findAll();
    Employee findById(Integer employeeId);
    Employee save(Employee theEmployee);
    void deleteById(Integer employeeId);
}
