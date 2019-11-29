package com.db.demo.domain;

import com.db.demo.model.Auditable;
import com.sun.javafx.beans.IDProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Audited
@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
public class Employee extends Auditable<String> {
    @Id
    @GeneratedValue
    private long id;

    @NotNull(message="name is required")
    private String name;
}
