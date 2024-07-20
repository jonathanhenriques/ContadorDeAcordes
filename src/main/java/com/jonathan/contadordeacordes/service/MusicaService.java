package com.jonathan.contadordeacordes.service;

import com.jonathan.contadordeacordes.model.Acorde;
import com.jonathan.contadordeacordes.model.Musica;
import com.jonathan.contadordeacordes.repository.AcordeRepository;
import com.jonathan.contadordeacordes.repository.MusicaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;

    @Autowired
    private AcordeRepository acordeRepository;

    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    public List<Musica> getAll(){
        return musicaRepository.findAll();
    }

    public Musica getById(Long id){
        return musicaRepository.getReferenceById(id);
    }

    public Musica post(Musica musica) {
        return musicaRepository.save(musica);
    }

    public void delete(Long idMusica) {
        Musica musica = musicaRepository.getReferenceById(idMusica);
        musicaRepository.delete(musica);
    }


    public Musica createMusica(Musica musica, List<Long> acordeIds) {
        List<Acorde> acordes = acordeRepository.findAllById(acordeIds);
        musica.setAcordes(acordes);
        return musicaRepository.save(musica);
    }
}
