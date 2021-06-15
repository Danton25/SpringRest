package org.example.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.example.Employee;

import java.util.ArrayList;
import java.util.List;
@RestController
@Component
//@RequestMapping(value = "/employees")
public class EmployeeController {
    List<Employee> a = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public List<Employee> findAll(){
        return a;
    }
    @RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
    public Employee findOne(@PathVariable("id") String empId){
        return null;
    }
//    @RequestMapping(method = RequestMethod.POST)
//    public Employee create(@RequestBody Employee employee){
//        return employee;
//    }
//    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
//    public Employee update(@PathVariable("id") String empId, @RequestBody Employee employee) {
//        return employee;
//    }
//    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
//    public void delete(@PathVariable("id") String empId){
//    }
}
