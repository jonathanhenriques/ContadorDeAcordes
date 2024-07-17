package com.jonathan.contadordeacordes.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

//    @OneToMany(cascade = CascadeType.ALL)
//    @OneToMany(mappedBy = "musica")
//    @JoinColumn(name = "musica_id")
//    @JoinTable(name = "tb_musica_alternativa", joinColumns = @JoinColumn(name = "musica_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "acorde_id", referencedColumnName = "id"))

    @ManyToMany
    @JoinTable(name = "musica_acorde", joinColumns = @JoinColumn(name = "musica_id"),
            inverseJoinColumns = @JoinColumn(name = "acorde_id")
    )
//    @JsonIgnoreProperties
    private List<Acorde> acordes = new ArrayList<Acorde>();
}
