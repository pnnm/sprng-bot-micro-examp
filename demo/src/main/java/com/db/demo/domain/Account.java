package com.db.demo.domain;

import com.db.demo.model.Auditable;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Audited
@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
public class Account extends Auditable<String> {
    @Id
    @GeneratedValue
    private long id;

    private String type;
    private double balance;
    private String status;
    private Date createdDate;
    private Date closeDate;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactionSet;


}
