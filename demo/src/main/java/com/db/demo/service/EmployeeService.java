package com.db.demo.service;

import com.db.demo.domain.Employee;
import com.db.demo.repository.EmployeeRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Transactional(propagation=Propagation.REQUIRED)
    public Employee saveEmployees(Employee employeeObjectToSave){
        Employee e1 = new Employee();
        e1.setName("munja");
        Employee e2 = employeeRepository.save(e1);
        System.out.println("heyyyyyy going to occur exception"+e2.getId());
       Employee e = employeeRepository.save(employeeObjectToSave);

       //before handling we get the following exception
        /**
         * {"timestamp":"2019-11-28T12:47:10.798+0000","status":500,"error":"Internal Server Error","message":"Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction","path":"/employees"}
         */

        //after transactionHandling
        return e;
    }


}
