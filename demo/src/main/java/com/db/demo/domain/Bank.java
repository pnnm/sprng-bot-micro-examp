package com.db.demo.domain;

import com.db.demo.model.Auditable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;
@Audited
@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
public class Bank extends Auditable<String> {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "bank",cascade = CascadeType.ALL)
    private List<Branch> branchList;

}
