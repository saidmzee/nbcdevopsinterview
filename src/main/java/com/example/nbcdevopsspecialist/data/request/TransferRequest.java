package com.example.nbcdevopsspecialist.data.request;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TransferRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String amount;
    private String accountNumber;
    private String referenceNumber;

    public TransferRequest(Long id, String fullName, String amount, String accountNumber, String referenceNumber) {
        this.id = id;
        this.fullName = fullName;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.referenceNumber = referenceNumber;
    }

    public TransferRequest() {
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAmount() {
        return amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
}
