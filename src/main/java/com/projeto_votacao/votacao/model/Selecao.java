package com.projeto_votacao.votacao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Selecao {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
        private Long id;
        private String tipo;
        private String String;
        private List<Item> itens;
}
