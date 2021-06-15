package org.example.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.example.entity.Employee;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {


    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findAll(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nikhil", "nik@gmail.com", 100000));
        employees.add(new Employee("Dan", "dan@gmail.com", 200000));
        employees.add(new Employee("Gary", "gary@gmail.com", 300000));
        return employees;
    }
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Employee findOne(@PathVariable("id") String empId){
        Employee emp = new Employee("Nikhil", "nik@gmail.com", 100000);
        return emp;
    }
    @RequestMapping(method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee){
        return employee;
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Employee update(@PathVariable("id") String empId, @RequestBody Employee employee) {
        return employee;
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") String empId){
    }
}
