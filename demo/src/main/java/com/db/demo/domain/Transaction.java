package com.db.demo.domain;

import com.db.demo.model.Auditable;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;
@Audited
@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
public class Transaction extends Auditable<String> {

    @Id
    @GeneratedValue
    private long id;

    private double transactionAmount;
    private String transactionDescription;
    private String merchantId;
    private Date transactionDate;
    private int toAccount;
    private String transactionType;
    private String transactionMode;
    private String transactionStatus;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

   }
