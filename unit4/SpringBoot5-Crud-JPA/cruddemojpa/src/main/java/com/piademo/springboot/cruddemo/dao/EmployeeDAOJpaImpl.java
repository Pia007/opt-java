package com.piademo.springboot.cruddemo.dao;

import com.piademo.springboot.cruddemo.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


// 4 Create Repository
// 7 Add methods from EmployeeDAO using standard JPA API
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    // define field for entityManager
    private EntityManager entityManager;

    // setup constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    // methods using standard JPA API
    @Override
    public List<Employee> findAll() {

        // create a query - using native JPA API

        Query theQuery = entityManager.createQuery("from Employee", Employee.class);

        // execute query and get a list of results
        List<Employee> employees = theQuery.getResultList();

        // return results
        return employees;
    }

    // Added from EmployeeDAO
    @Override
    public Employee findById(int theId) {

        // get the employee using JPA API
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // return the employee
        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {

        //save employee - using JPA API
            // if id = 0 --> save, otherwise update
        Employee dbEmployee = entityManager.merge(theEmployee);

            // update with id from db .. so that an id is generated for save/insert
        theEmployee.setId(dbEmployee.getId());
    }

    @Override
    public void deleteById(int theId) {

        // delete the employee
        Query theQuery = entityManager.createQuery(
                "DELETE from Employee WHERE id=:employeeId");

        theQuery.setParameter("employeeId", theId);

        theQuery.executeUpdate();
    }
}
