package com.loan.application.service;

import com.loan.application.repository.BaseRepository;
import com.loan.application.model.LoanRequest;
import com.loan.application.repository.LoanRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LoanRequestService {
    private BaseRepository<LoanRequestRepository> baseRepository;

    @Autowired
    public LoanRequestService(LoanRequestRepository loanRequestRepository) {
        baseRepository = new BaseRepository<>(loanRequestRepository);
    }

    public List<LoanRequest> getAllLoanRequests() {
        return baseRepository.findAll();
    }

    public LoanRequest saveLoanRequest(LoanRequest loanRequest) {
        if(Objects.isNull(loanRequest.getCitizenshipNumber())) {
            throw new NullPointerException();
        }
        return baseRepository.save(loanRequest);
    }
}
