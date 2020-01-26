package com.loan.application.repository;

import com.loan.application.model.LoanRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public class BaseRepository<T extends MongoRepository> {
    private T t;

    public BaseRepository(T t) {
        this.t = t;
    }

    public <E extends LoanRequest> E save(E e) {
        t.save(e);
        return e;
    }

    public <E extends LoanRequest> List<E> findAll() {
        return t.findAll();
    }
}
