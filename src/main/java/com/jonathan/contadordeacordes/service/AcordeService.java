package com.jonathan.contadordeacordes.service;

import com.jonathan.contadordeacordes.model.Acorde;
import com.jonathan.contadordeacordes.model.Musica;
import com.jonathan.contadordeacordes.repository.AcordeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AcordeService {

    @Autowired
    private AcordeRepository acordeRepository;

    public AcordeService(AcordeRepository acordeRepository) {
        this.acordeRepository = acordeRepository;
    }

    public List<Acorde> getAll(){
        return acordeRepository.findAll();
    }

    public Acorde getById(Long id){
        return acordeRepository.getReferenceById(id);
    }

    public Acorde post(Acorde acorde) {
        return acordeRepository.save(acorde);
    }
}
