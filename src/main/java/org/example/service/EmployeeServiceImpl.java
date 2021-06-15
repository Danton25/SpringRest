package org.example.service;

import org.example.entity.Employee;
import org.example.exception.EmployeeNotFoundException;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findOne(String id) {
        Employee emp = employeeRepository.findOne(id);
        if(emp == null){
            throw new EmployeeNotFoundException("Employee with id: "+id+" Not found");
        }
        else return emp;
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
