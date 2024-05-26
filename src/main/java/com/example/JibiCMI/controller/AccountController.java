package com.example.JibiCMI.controller;

import com.example.JibiCMI.model.Account;
import com.example.JibiCMI.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/addAccount")
    public Account addAccount(@RequestParam Long id, @RequestParam Float initialBalance) {
        return accountService.createAccount(id, initialBalance);
    }



//    @GetMapping("/debitBalance")
//    public void debitBalance(@RequestParam Long accountId, @RequestParam Float amount) {
//        accountService.debitBalance(accountId, amount);
//    }
}

