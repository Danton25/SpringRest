package org.example.service;

import org.example.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nikhil", "nik@gmail.com", 100000));
        employees.add(new Employee("Dan", "dan@gmail.com", 200000));
        employees.add(new Employee("Gary", "gary@gmail.com", 300000));
        return employees;
    }

    @Override
    public Employee findOne(String id) {
        Employee emp = new Employee("Nikhil", "nik@gmail.com", 100000);
        return emp;
    }

    @Override
    public void create(Employee emp) {

    }

    @Override
    public void update(String id, Employee emp) {

    }

    @Override
    public void delete(String id) {

    }
}
