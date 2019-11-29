package com.db.demo.service;

import com.db.demo.exception.PersistentException;

public interface GenericService<Q, S> {

    S create(Q rq) throws PersistentException;
}