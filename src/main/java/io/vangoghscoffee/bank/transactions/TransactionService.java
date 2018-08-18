package io.vangoghscoffee.bank.transactions;

import io.vangoghscoffee.bank.accounts.Account;
import io.vangoghscoffee.bank.accounts.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TransactionService  {

    @Autowired
    AccountService accountService;

    private List<Transaction> transactions = new ArrayList<>();

    public List<Transaction> getAllTransactions() {
        return this.transactions;
    }

    public Transaction createTransaction(Transaction transaction) {

        Transaction newTransaction = transaction;
        Account senderAccount;
        Account receiverAccount;

        try {
            senderAccount = accountService.getAccount(newTransaction.getSenderAccountUuid());
        } catch (NullPointerException e) {
            System.out.println("Couldn't find sender account");
            return null;
        }

        try {
            receiverAccount = accountService.getAccount(newTransaction.getReceiverAccountUuid());
        } catch (NullPointerException e) {
            System.out.println("Couldn't find receiver account");
            return null;
        }

        senderAccount.substractBalance(newTransaction.getAmount());

        try {
            receiverAccount.addBalance(newTransaction.getAmount());
        } catch (Exception e) {
            senderAccount.addBalance(newTransaction.getAmount());
            return null;
        }

        newTransaction.setVerified(true);
        this.transactions.add(newTransaction);
        return newTransaction;
    }
}
