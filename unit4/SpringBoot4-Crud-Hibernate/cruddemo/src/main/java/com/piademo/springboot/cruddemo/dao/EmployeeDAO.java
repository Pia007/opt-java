package com.piademo.springboot.cruddemo.dao;

import com.piademo.springboot.cruddemo.entity.Employee;

import java.util.List;


// 2 CREATE EmployeeDAO -same as DTO
// 6  Adding methods to DAO
public interface EmployeeDAO {

    public List<Employee> findAll ();

    // get single employee
    public  Employee findById(int theId);

    // add an employee
    public void save(Employee theEmployee);

    // delete
    public void deleteById(int theId);
}
