package io.vangoghscoffee.bank.accounts;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;

@Service
public class AccountService {

    private ArrayList<Account> accounts = new ArrayList<>();

    public List<Account> getAllAccounts() {
        return this.accounts;
    }

    public Account createAccount(String currency) {
        Currency accountcur = Currency.getInstance(currency);
        Account account = new Account(Currency.getInstance("USD"));
        accounts.add(account);
        return account;
    }
}
