package com.piademo.springboot.cruddemo.rest;

import com.piademo.springboot.cruddemo.dao.EmployeeDAO;
import com.piademo.springboot.cruddemo.entity.Employee;
import com.piademo.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 5 Rest Controller
// 10 refactor to use the service
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    //fields
    private EmployeeService employeeService;

    // using constructor injection
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // Get all employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
