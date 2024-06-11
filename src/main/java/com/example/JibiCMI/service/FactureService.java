package com.example.JibiCMI.service;

import com.example.JibiCMI.model.Facture;
import com.example.JibiCMI.model.Statusfacture;
import com.example.JibiCMI.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class FactureService {

    @Autowired
    private FactureRepository factureRepository;


    public List<Facture> getImpayeFacturesByRefAndCreance(String factref, Long creance) {
        return factureRepository.findByStatusfactureAndFactrefAndCreance_Id(Statusfacture.IMPAYE, factref, creance);
    }
}
