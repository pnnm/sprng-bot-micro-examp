package com.db.demo.repository;

import com.db.demo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findByFirstName(String name);
}
