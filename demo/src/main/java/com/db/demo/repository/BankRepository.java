package com.db.demo.repository;

import com.db.demo.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BankRepository extends JpaRepository<Bank, Long> {

}
