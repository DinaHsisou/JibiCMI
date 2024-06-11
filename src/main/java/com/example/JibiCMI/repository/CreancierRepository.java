package com.example.JibiCMI.repository;

import com.example.JibiCMI.model.Creancier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreancierRepository extends JpaRepository<Creancier, Long> {
    // You can add custom query methods here if needed
}
