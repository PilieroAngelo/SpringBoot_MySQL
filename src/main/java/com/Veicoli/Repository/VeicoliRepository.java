package com.Veicoli.Repository;

import com.Veicoli.Model.Veicoli;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeicoliRepository extends JpaRepository<Veicoli, Integer> {
}
