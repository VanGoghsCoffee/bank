package io.vangoghscoffee.bank.accounts;

import io.vangoghscoffee.bank.transactions.Transaction;

import java.util.ArrayList;
import java.util.Currency;
import java.util.UUID;

public class Account {
    public Account(Currency currency) {
        this.id = UUID.randomUUID().toString();
        this.currency = currency;
        this.balance = 0.0;
    }

    public String getId() {
        return id;
    }

    public Double getBalance() {
        return balance;
    }

    public void addBalance(Double balance) {
        this.balance += balance;
    }

    public void substractBalance(Double balance) {
        this.balance -= balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    private String id;
    private Double balance;
    private Currency currency;
    private ArrayList<Transaction> transactions;
}
