package org.example.repository;

import org.example.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {



    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nikhil", "nik@gmail.com", 100000));
        employees.add(new Employee("Dan", "dan@gmail.com", 200000));
        employees.add(new Employee("Gary", "gary@gmail.com", 300000));
        return employees;
    }

    @Override
    public Employee findOne(String empId) {
        Employee emp = new Employee("Nikhil", "nik@gmail.com", 100000);
        return null;
    }
}
