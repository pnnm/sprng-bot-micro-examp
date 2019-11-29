package com.db.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;


@Data
@AllArgsConstructor
public class AddressModel implements Serializable {

    private  long sum;

    private String satus;

}
