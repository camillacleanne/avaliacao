package com.generation.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.avaliacao.model.Participante;


@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
	//ASSINATURA DE METODO
}

