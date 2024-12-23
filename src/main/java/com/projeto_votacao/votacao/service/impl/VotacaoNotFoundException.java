package com.projeto_votacao.votacao.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VotacaoNotFoundException extends RuntimeException {
    public VotacaoNotFoundException(Long idVotacao) {
        super("Votação com ID " + idVotacao + " não encontrada");
    }
}
