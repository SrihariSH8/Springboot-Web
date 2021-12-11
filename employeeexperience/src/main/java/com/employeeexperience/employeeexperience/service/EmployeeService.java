package com.employeeexperience.employeeexperience.service;

import com.employeeexperience.employeeexperience.entity.Employee;
import com.employeeexperience.employeeexperience.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        log.info("Inside saveEmployee method of EmployeeService");
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long employeeId) {
        log.info("Inside findEmployeeById method of EmployeeService");
        return employeeRepository.findByEmployeeId(employeeId);


    }
}

