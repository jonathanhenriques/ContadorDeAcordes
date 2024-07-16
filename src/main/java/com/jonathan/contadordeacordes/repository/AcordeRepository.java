package com.jonathan.contadordeacordes.repository;

import com.jonathan.contadordeacordes.model.Acorde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcordeRepository extends JpaRepository<Acorde, Long> {
}
