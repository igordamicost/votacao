package com.projeto_votacao.votacao.service.impl;

import com.projeto_votacao.votacao.model.Votacao;
import com.projeto_votacao.votacao.repository.VotacaoRepository;
import com.projeto_votacao.votacao.service.VotacaoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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
                .orElseThrow(() -> new VotacaoNotFoundException(idVotacao));
    }
    @Override
    public Votacao registerData(Votacao votacao) {
        return repository.save(votacao);
    }
}

