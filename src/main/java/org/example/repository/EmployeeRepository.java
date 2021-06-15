package org.example.repository;

import org.example.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeRepository {
    public List<Employee> findAll();
    public Employee findOne(String empId);
}
