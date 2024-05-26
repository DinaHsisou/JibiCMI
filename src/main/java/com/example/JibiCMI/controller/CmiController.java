package com.example.JibiCMI.controller;

import com.example.JibiCMI.model.Account;
import com.example.JibiCMI.model.Client;
import com.example.JibiCMI.model.CmiResponse;

import com.example.JibiCMI.repository.ClientRepository;
import com.example.JibiCMI.service.AccountService;
import com.example.JibiCMI.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cmi")
public class CmiController {

    @Autowired
    private ClientService clientservice;
    @Autowired
    private AccountService accountService;
    @Autowired
    private ClientRepository clientRepository;


    @PostMapping("/verify")
    public CmiResponse verifyClient(@RequestBody Client client) {
        System.out.println(client);
        CmiResponse response = new CmiResponse();
        response.setFavorable(true);
        clientservice.createClient(client);
        return response;
    }
    @PostMapping("/checkBalance")
    public boolean checkBalance(@RequestParam Long clientId, @RequestParam Float amount) {
     Account account = clientRepository.findById(clientId).get().getAccount();
        return accountService.checkBalance(account.getId(), amount);
    }
}

