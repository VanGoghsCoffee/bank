package io.vangoghscoffee.bank.accounts;

import io.vangoghscoffee.bank.transactions.Transaction;

import java.util.ArrayList;
import java.util.Currency;
import java.util.UUID;

public class Account {
    public Account() {
        this.id = UUID.randomUUID();
        this.balance = 0.0;
    }

    public UUID getId() {
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


    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    private UUID id;
    private Double balance;
    private ArrayList<Transaction> transactions;
}
