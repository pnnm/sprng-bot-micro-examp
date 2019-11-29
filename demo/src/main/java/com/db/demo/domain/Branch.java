package com.db.demo.domain;

import javax.persistence.*;
import java.util.List;

import com.db.demo.model.Auditable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Audited
@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
public class Branch extends Auditable<String> {
    @Id
    @GeneratedValue
    private long id;

    private String branchCode;

    private String branchName;

    private String branchType;

    @ManyToOne
    @JoinColumn(name="bank_id")
    private Bank bank;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "branch_customers",
            joinColumns = { @JoinColumn(name = "branch_id") },
            inverseJoinColumns = { @JoinColumn(name = "customer_id") })
    private List<Customer> customers;



}
