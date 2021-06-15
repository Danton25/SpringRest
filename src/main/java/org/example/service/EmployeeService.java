package org.example.service;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findOne(String id);
    void create(Employee emp);
    void update(String id, Employee emp);
    void delete(String id);
}
