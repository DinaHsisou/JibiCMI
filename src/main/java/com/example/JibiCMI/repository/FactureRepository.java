package com.example.JibiCMI.repository;

import com.example.JibiCMI.model.Facture;
import com.example.JibiCMI.model.Statusfacture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {

    List<Facture> findByStatusfactureAndFactrefAndCreance_Id(Statusfacture statusfacture, String factref, Long creanceId);
}
