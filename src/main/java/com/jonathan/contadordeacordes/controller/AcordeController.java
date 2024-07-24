package com.jonathan.contadordeacordes.controller;

import com.jonathan.contadordeacordes.model.Acorde;
import com.jonathan.contadordeacordes.model.Musica;
import com.jonathan.contadordeacordes.service.AcordeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@Slf4j
@RestController
@RequestMapping("/acordes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class AcordeController {

    private static final Logger logger = LoggerFactory.getLogger(Acorde.class);

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

    @DeleteMapping("/{id}")
    @ResponseStatus(code = NO_CONTENT)
    public ResponseEntity<?> delete(@PathVariable Long id){
        acordeService.delete(id);
        logger.info("Excluido");
        return ResponseEntity.status(NO_CONTENT).build();
    }


}
