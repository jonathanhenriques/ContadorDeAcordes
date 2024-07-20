package com.jonathan.contadordeacordes.controller;

import com.jonathan.contadordeacordes.model.Acorde;
import com.jonathan.contadordeacordes.model.Musica;
import com.jonathan.contadordeacordes.service.AcordeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acordes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class AcordeController {

    @Autowired
    private AcordeService acordeService;

    public AcordeController(AcordeService acordeService) {
        this.acordeService = acordeService;
    }

    @GetMapping
    public ResponseEntity<List<Acorde>> getAll(){
        return ResponseEntity.ok(acordeService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Acorde> get(@PathVariable Long id){
        return ResponseEntity.ok(acordeService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Acorde> post(@RequestBody Acorde acorde){
        return ResponseEntity.ok(acordeService.post(acorde));
    }


}
