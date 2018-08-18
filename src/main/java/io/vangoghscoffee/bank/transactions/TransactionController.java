package io.vangoghscoffee.bank.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value="/transactions", method=RequestMethod.GET)
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @RequestMapping(value="/transactions", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }
}
