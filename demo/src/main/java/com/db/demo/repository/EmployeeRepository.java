package com.db.demo.repository;

import com.db.demo.domain.Employee;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{
}
