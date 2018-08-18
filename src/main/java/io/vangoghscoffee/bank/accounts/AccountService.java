package io.vangoghscoffee.bank.accounts;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;

@Service
public class AccountService {

    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAllAccounts() {
        return this.accounts;
    }

    public Account getAccount(UUID accountId) {
        System.out.println("Find account with uuid: " + accountId);
        System.out.println(this.accounts.stream().filter(account -> accountId == account.getId()).findAny());
        return this.accounts.stream().filter(account -> accountId.equals(account.getId()))
                .findAny()
                .orElseThrow(NullPointerException::new);
    }

    public Account createAccount() {
        Account account = new Account();
        accounts.add(account);
        return account;
    }
}
