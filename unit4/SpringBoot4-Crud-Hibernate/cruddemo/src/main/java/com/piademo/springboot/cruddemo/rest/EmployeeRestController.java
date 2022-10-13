package com.piademo.springboot.cruddemo.rest;

import com.piademo.springboot.cruddemo.dao.EmployeeDAO;
import com.piademo.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 5 Rest Controller
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    //fields
    private EmployeeDAO employeeDAO;

    // quick and dirty: inject the employee DAO ( using constructor injection)
    @Autowired
    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    // Get all employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
