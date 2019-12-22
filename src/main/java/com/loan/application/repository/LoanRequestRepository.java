package com.loan.application.repository;

import com.loan.application.model.LoanRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;

public interface LoanRequestRepository extends MongoRepository<LoanRequest, BigInteger> {
}
