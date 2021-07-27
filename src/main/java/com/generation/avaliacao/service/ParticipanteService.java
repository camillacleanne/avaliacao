package com.generation.avaliacao.service;

import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.avaliacao.exception.MenorIdadeException;
import com.generation.avaliacao.model.Participante;
import com.generation.avaliacao.repository.ParticipanteRepository;

@Service
public class ParticipanteService {

	@Autowired
	private ParticipanteRepository repository;

	public Participante save(Participante participante) {
		Period idade = Period.between(participante.getDataNasc(), participante.getDataCadastro());
		// TODO Auto-generated method stub
		System.out.println(idade.getYears());
	
		
		if(idade.getYears() > 18) {
			repository.save(participante);
			return participante;
		}
		else {
			throw new MenorIdadeException("Participante ainda não tem idade mínima para ingressar no bootcamp,"
					+ " favor refazer a inscrição aos 18 anos");
		}
	}
}
