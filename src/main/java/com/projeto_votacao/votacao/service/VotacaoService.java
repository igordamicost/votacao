package com.projeto_votacao.votacao.service;

import com.projeto_votacao.votacao.model.Votacao;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VotacaoService {

    List<Votacao> findAll();

    Votacao findById(Long idVotacao);

    Votacao registerData(Votacao votacaoData);
}
