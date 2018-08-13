package io.vangoghscoffee.bank.transactions;

import io.vangoghscoffee.bank.accounts.Account;

import java.util.Currency;
import java.util.UUID;

public class Transaction {
    public Transaction() {
        this.id = UUID.randomUUID().toString();
    }

    public Transaction(Account senderAccount, Account receiverAccount, Double amount, Currency currency) {
        this.id = UUID.randomUUID().toString();
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public Account getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(Account senderAccount) {
        this.senderAccount = senderAccount;
    }

    public Account getReceiverAccount() {
        return receiverAccount;
    }

    public void setReceiverAccount(Account receiverAccount) {
        this.receiverAccount = receiverAccount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    private String id;
    private Account senderAccount;
    private Account receiverAccount;
    private Double amount;
    private Currency currency;
}
