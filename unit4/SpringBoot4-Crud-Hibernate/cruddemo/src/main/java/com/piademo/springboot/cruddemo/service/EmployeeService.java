package com.piademo.springboot.cruddemo.service;

import com.piademo.springboot.cruddemo.entity.Employee;

import java.util.List;

// 8 create Employee Service and add methods
public interface EmployeeService {

    // methods -same as DAO
    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);
}
