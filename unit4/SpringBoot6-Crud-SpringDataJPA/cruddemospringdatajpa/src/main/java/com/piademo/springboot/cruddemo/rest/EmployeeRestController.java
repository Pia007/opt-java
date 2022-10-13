package com.piademo.springboot.cruddemo.rest;

import com.piademo.springboot.cruddemo.entity.Employee;
import com.piademo.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 5 Rest Controller
// 10 refactor to use the service
// 11 Get by id and add
// 12 Update and delete
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

    // Get employee by id
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {

        //delegate the calls to the service
        Employee theEmployee = employeeService.findById(employeeId);

        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found: " + employeeId);
        }
        return theEmployee;
    }

    // add mapping for Post
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {

        // just in case an id is passed into JSON...set id to 0
        // this forces a save of a new item... instead of an update

        theEmployee.setId(0);

        employeeService.save(theEmployee);

        return theEmployee;
    }

    // update
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {

        employeeService.save(theEmployee);

        return theEmployee;
    }

    // delete
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {

        Employee tempEmployee = employeeService.findById(employeeId);

        if (tempEmployee == null) {
            throw new RuntimeException("Employee id not found: " + employeeId);
        }

        employeeService.deleteById(employeeId);

        return "Deleted Employee id: " + employeeId;
    }
}
