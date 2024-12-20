package com.projeto_votacao.votacao.service.impl;

import com.projeto_votacao.votacao.model.Votacao;
import com.projeto_votacao.votacao.repository.VotacaoRepository;
import com.projeto_votacao.votacao.service.VotacaoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class VotacaoServiceImpl implements VotacaoService {
    @Autowired
    private VotacaoRepository repository;

    @Override
    public List<Votacao> findAll() {
        return repository.findAll();
    }

    @Override
    public Votacao findById(Long idVotacao) {
        return repository.findById(idVotacao)
                .orElseThrow(() -> new RuntimeException("Votação não existe"));
    }
}
