package com.db.demo.repository;

import com.db.demo.domain.Address;
import com.db.demo.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface AddressRepository extends JpaRepository<Address,Long> {

    @Query("select new com.db.demo.model.AddressModel(sum(a.id),a.state) from Address a group by a.state")
    List<AddressModel> getDataByState();
}
