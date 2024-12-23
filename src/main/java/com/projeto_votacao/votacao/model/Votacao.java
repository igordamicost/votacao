package com.projeto_votacao.votacao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Votacao {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
        private Long id;
        private String campo1;
        private String campo2;
        private String idCampoTexto;
        private String idCampoData;
}
