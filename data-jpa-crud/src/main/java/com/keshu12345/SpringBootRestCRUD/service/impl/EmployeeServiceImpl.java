package com.keshu12345.SpringBootRestCRUD.service.impl;

import com.keshu12345.SpringBootRestCRUD.dao.EmployeeRepository;
import com.keshu12345.SpringBootRestCRUD.entity.Employee;
import com.keshu12345.SpringBootRestCRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer employeeId) {
        Optional<Employee> result=employeeRepository.findById(employeeId);
        Employee theEmployee=null;
        if(result.isPresent()){
          theEmployee= result.get();
        }else{
            throw new RuntimeException("did not find employeeId -"+employeeId);
        }
        return theEmployee;
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(Integer employeeId) {
        employeeRepository.deleteById(employeeId);

    }
}
