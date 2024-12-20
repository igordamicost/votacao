package com.projeto_votacao.votacao.repository;

import com.projeto_votacao.votacao.model.Votacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VotacaoRepository extends JpaRepository<Votacao,Long> {

}
