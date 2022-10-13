package com.piademo.springboot.cruddemo.dao;

import com.piademo.springboot.cruddemo.entity.Employee;

import java.util.List;


// 2 CREATE EmployeeDAO -same as DTO
public interface EmployeeDAO {

    public List<Employee> findAll ();
}
