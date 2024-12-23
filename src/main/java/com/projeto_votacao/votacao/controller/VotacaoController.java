package com.projeto_votacao.votacao.controller;

import com.projeto_votacao.votacao.model.Votacao;
import com.projeto_votacao.votacao.service.VotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/votacao")
public class VotacaoController {
    @Autowired
    private VotacaoService service;
    @GetMapping
    public ResponseEntity<List<Votacao>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{idVotacao}")
    public ResponseEntity<Votacao> getById(Long idVotacao) {
        return ResponseEntity.ok(service.findById(idVotacao));
    }
    @PostMapping()
    public ResponseEntity<Votacao> post(Votacao votacao) {
        return ResponseEntity.ok(service.registerData(votacao));
    }
}
