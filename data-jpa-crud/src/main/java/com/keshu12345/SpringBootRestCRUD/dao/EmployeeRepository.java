package com.keshu12345.SpringBootRestCRUD.dao;

import com.keshu12345.SpringBootRestCRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
