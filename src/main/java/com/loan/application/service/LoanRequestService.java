package com.loan.application.service;

import com.loan.application.model.LoanRequest;
import com.loan.application.repository.LoanRequestRepository;
import org.springframework.beans.InvalidPropertyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LoanRequestService {
    private LoanRequestRepository loanRequestRepository;

    @Autowired
    public LoanRequestService(LoanRequestRepository loanRequestRepository) {
        this.loanRequestRepository = loanRequestRepository;
    }

    public List<LoanRequest> getAllLoanRequests() {
        return loanRequestRepository.findAll();
    }

    public LoanRequest saveLoanRequest(LoanRequest loanRequest) {
        if(Objects.isNull(loanRequest.getCitizenshipNumber())) {
            throw new NullPointerException();
        }
        return loanRequestRepository.save(loanRequest);
    }
}
