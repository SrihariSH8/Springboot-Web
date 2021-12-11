package com.employeeexperience.employeeexperience.controller;


import com.employeeexperience.employeeexperience.entity.Employee;
import com.employeeexperience.employeeexperience.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        log.info("inside saveEmployee method of EmployeeController");
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") Long employeeId){
        log.info("inside findEmployeeById method of EmployeeController");
        return employeeService.findEmployeeById(employeeId);
    }


}
