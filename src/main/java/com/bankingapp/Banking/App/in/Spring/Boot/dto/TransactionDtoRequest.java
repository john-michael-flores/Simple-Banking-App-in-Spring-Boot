package com.bankingapp.Banking.App.in.Spring.Boot.dto;

public class TransactionDtoRequest {
    private String type;
    private double amount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
