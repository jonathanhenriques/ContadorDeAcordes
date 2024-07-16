package com.jonathan.contadordeacordes.controller;

import com.jonathan.contadordeacordes.model.Acorde;
import com.jonathan.contadordeacordes.model.Musica;
import com.jonathan.contadordeacordes.service.AcordeService;
import com.jonathan.contadordeacordes.service.MusicaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musicas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }

    @GetMapping
    public ResponseEntity<List<Musica>> getAll(){
        return ResponseEntity.ok(musicaService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Musica> get(@PathVariable Long id){
        return ResponseEntity.ok(musicaService.getById(id));
    }


}
