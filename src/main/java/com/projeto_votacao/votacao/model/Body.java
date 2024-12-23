package com.projeto_votacao.votacao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@TableGenerator(name = "body_generator", table = "body_sequence",
        pkColumnName = "seq_name", valueColumnName = "seq_value",
        pkColumnValue = "body_seq", allocationSize = 1)
public class Body {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "body_generator")
    private String dadosOpcao;
}
