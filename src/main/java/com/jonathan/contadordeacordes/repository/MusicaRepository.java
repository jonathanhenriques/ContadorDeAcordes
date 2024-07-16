package com.jonathan.contadordeacordes.repository;

import com.jonathan.contadordeacordes.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Long> {
}
