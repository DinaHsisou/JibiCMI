package com.example.JibiCMI.service;

import com.example.JibiCMI.model.Account;
import com.example.JibiCMI.model.Client;
import com.example.JibiCMI.repository.AccountRepository;
import com.example.JibiCMI.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

    @Autowired
     private ClientRepository clientRepository ;
    public Client createClient(Client client) {
        client.setFirstName(client.getFirstName());
        client.setLastName(client.getLastName());
        client.setCin(client.getCin());

        return clientRepository.save(client);
    }


}
