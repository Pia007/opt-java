package com.piademo.springboot.cruddemo.service;

import com.piademo.springboot.cruddemo.dao.EmployeeRepository;
import com.piademo.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

// 9 create EmployeeServeImpl
// 14 Use EmployeeRepository
    // remove Transactional bc JpaRepository has that functionality
@Service
public class EmployeeServiceImpl implements EmployeeService{

    // fields - updated to the repo
    private EmployeeRepository employeeRepository;

    // constructor
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        //delegate to the employeeRepository
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        Employee employee = null;

        if (result.isPresent()) {
            employee = result.get();
        } else {
            throw new RuntimeException("Employee id: " + theId);
        }
        return employee;
    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
