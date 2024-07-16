package com.jonathan.contadordeacordes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_MUSICA")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "musica")
//    @JoinColumn(name = "musica_id")
//    @JoinTable(name = "tb_musica_alternativa", joinColumns = @JoinColumn(name = "musica_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "acorde_id", referencedColumnName = "id"))
    private List<Acorde> acordes = new ArrayList<Acorde>();
}
