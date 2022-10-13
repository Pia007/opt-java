package com.piademo.springboot.cruddemo.dao;

import com.piademo.springboot.cruddemo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;


// 4 Create Repository - DAO implementation
@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    // define field for entityManager
    private EntityManager entityManager;

    // setup constructor injection
    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create a query - using native Hibernate API
        Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

        // execute query and get a list of results
        List<Employee> employees = theQuery.getResultList();

        // return results
        return employees;
    }
}
