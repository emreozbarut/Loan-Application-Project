package com.loan.application.controller.loan;

import com.loan.application.model.LoanRequest;
import com.loan.application.repository.LoanRequestRepository;
import com.loan.application.service.LoanRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController("/loan")
public class LoanController {

    private LoanRequestService loanRequestService;

    @Autowired
    public LoanController(LoanRequestService loanRequestService) {
        this.loanRequestService = loanRequestService;
    }

    @PostMapping("/save")
    public LoanRequest save(@RequestBody LoanRequest loanRequest) {
        return loanRequestService.saveLoanRequest(loanRequest);
    }

    @GetMapping("/")
    public List<LoanRequest> getAll() {
        return loanRequestService.getAllLoanRequests();
    }
}
