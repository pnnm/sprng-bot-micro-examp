package com.db.demo.domain;

import com.db.demo.model.Auditable;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
@Audited
@Data
@Entity
public class Address extends Auditable<String> {

    @Id
    @GeneratedValue
    private long id;

    private String address1;

    private String address2;

    private String state;

    private String city;

    private String pin;

    private Timestamp  timestamp;

    }
