package com.piademo.springboot.cruddemo.dao;

import com.piademo.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/*13 Removed all DAO files

create employee repository

*/

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // no need to write any code
}
