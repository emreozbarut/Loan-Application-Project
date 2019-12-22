package com.loan.application.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@Document(collection = "LoanRequests")
public class LoanRequest {
    @Id
    @NotNull
    private BigInteger citizenshipNumber;
    private String name;
    private String surname;
    private BigDecimal monthlyIncome;
    private BigInteger phoneNumber;

    public BigInteger getCitizenshipNumber() {
        return citizenshipNumber;
    }
}