package com.piademo.springboot.cruddemo.dao;

import com.piademo.springboot.cruddemo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;


// 4 Create Repository
// 7 Add methods from EmployeeDAO
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
    //@Transactional remove bc will create a service
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

    // Added from EmployeeDAO
    @Override
    public Employee findById(int theId) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the employee
        Employee theEmployee = currentSession.get(Employee.class, theId);

        // return the employee
        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);


        //save employee
            // saveOrUpdate - if id = 0 --> save, otherwise update
        currentSession.saveOrUpdate(theEmployee);
    }

    @Override
    public void deleteById(int theId) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // delete the employee
        Query theQuery = currentSession.createQuery(
                "DELETE from Employee WHERE id=:employeeId");

        theQuery.setParameter("employeeId", theId);

        theQuery.executeUpdate();
    }
}
