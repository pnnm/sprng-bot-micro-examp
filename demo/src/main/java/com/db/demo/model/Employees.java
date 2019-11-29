package com.db.demo.model;

import com.db.demo.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
//@AllArgsConstructor
public class Employees implements Serializable {
   List<Employee> employeeList;
}
