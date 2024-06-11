package com.example.JibiCMI.repository;

import com.example.JibiCMI.model.Creance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreanceRepository extends JpaRepository<Creance, Long> {
    // You can add custom query methods here if needed
}
