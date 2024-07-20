package com.jonathan.contadordeacordes.controller;

import com.jonathan.contadordeacordes.model.Acorde;
import com.jonathan.contadordeacordes.model.Musica;
import com.jonathan.contadordeacordes.service.AcordeService;
import com.jonathan.contadordeacordes.service.MusicaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@Slf4j
@RestController
@RequestMapping("/musicas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MusicaController {

    private static final Logger logger = LoggerFactory.getLogger(MusicaController.class);

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

    @PostMapping
    public ResponseEntity<Musica> post(@RequestBody Musica musica){
        return ResponseEntity.ok(musicaService.post(musica));
    }

//    @PostMapping(path = "/lista")
//    public ResponseEntity<Musica> createMusica(@RequestBody MusicaRequest musicaRequest) {
//        Musica novaMusica = musicaService.createMusica(musicaRequest.getMusica(), musicaRequest.getAcordeIds());
//        return ResponseEntity.ok(novaMusica);
//    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = NO_CONTENT)
    public ResponseEntity<?> delete(@PathVariable Long id){
        musicaService.delete(id);
        logger.info("Excluido");
        return ResponseEntity.status(NO_CONTENT).build();
    }



//    public static class MusicaRequest {
//        private Musica musica;
//        private List<Long> acordeIds;
//
//        public Musica getMusica() {
//            return musica;
//        }
//
//        public void setMusica(Musica musica) {
//            this.musica = musica;
//        }
//
//        public List<Long> getAcordeIds() {
//            return acordeIds;
//        }
//
//        public void setAcordeIds(List<Long> acordeIds) {
//            this.acordeIds = acordeIds;
//        }
//    }


}
