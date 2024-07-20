package com.jonathan.contadordeacordes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_ACORDE")
public class Acorde {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String letra;
    private String nome;
//    private Long repeticoes;

//    @ManyToOne
//    @JoinColumn(name = "musica_id")
//    private Musica musica;


}
