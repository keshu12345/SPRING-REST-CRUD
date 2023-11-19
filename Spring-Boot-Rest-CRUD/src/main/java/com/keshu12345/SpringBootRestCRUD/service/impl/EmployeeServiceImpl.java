package com.keshu12345.SpringBootRestCRUD.service.impl;

import com.keshu12345.SpringBootRestCRUD.dao.EmployeeDAO;
import com.keshu12345.SpringBootRestCRUD.entity.Employee;
import com.keshu12345.SpringBootRestCRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(Integer employeeId) {
        return employeeDAO.findById(employeeId);
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(Integer employeeId) {
        employeeDAO.deleteById(employeeId);

    }
}
