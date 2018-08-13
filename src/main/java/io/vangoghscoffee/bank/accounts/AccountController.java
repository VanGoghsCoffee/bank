package io.vangoghscoffee.bank.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value="/accounts", method=RequestMethod.GET)
    public List<Account> getAllAccounts() {
        return this.accountService.getAllAccounts();
    }

    @RequestMapping(value="/accounts", method=RequestMethod.POST)
    public Account createAccount(@RequestBody String currency) {
        return this.accountService.createAccount(currency);
    }
}
