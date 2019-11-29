package com.db.demo.repository;

import com.db.demo.domain.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,Long> {
    public Branch findByBranchCode(String code);
}
