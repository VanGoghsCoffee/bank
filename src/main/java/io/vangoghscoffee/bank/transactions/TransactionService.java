package io.vangoghscoffee.bank.transactions;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TransactionService  {

    private List<Transaction> transactions = Arrays.asList();

    public List<Transaction> getAllTransactions() {
        return this.transactions;
    }
}
