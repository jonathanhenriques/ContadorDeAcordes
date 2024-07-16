package com.jonathan.contadordeacordes.service;

import com.jonathan.contadordeacordes.model.Musica;
import com.jonathan.contadordeacordes.repository.MusicaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;

    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    public List<Musica> getAll(){
        return musicaRepository.findAll();
    }

    public Musica getById(Long id){
        return musicaRepository.getReferenceById(id);
    }
}
