package com.example.JibiCMI.controller;

import com.example.JibiCMI.model.Account;
import com.example.JibiCMI.model.Client;
import com.example.JibiCMI.model.CmiResponse;
import com.example.JibiCMI.repository.ClientRepository;
import com.example.JibiCMI.service.AccountService;
import com.example.JibiCMI.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cmi")
public class CmiController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private AccountService accountService;
    @Autowired
    private ClientRepository clientRepository;

    @PostMapping("/verify")
    public CmiResponse verifyClient(@RequestBody Client client) {
        System.out.println(client);
        CmiResponse response = new CmiResponse();
        response.setFavorable(true);
        clientService.createClient(client);
        return response;
    }

    @PostMapping("/checkBalance")
    public boolean checkBalance(@RequestBody BalanceRequest balanceRequest) {
        Account account = clientRepository.findById(balanceRequest.getUserId()).orElseThrow().getAccount();
        Boolean isBalanceSufficient = accountService.checkBalance(account.getId(), balanceRequest.getAmount().floatValue());
        if(isBalanceSufficient) {
            accountService.debitBalance(account.getId(), balanceRequest.getAmount());
        }
        return isBalanceSufficient;
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class BalanceRequest {
    private Long userId;
    private Double amount;
}
