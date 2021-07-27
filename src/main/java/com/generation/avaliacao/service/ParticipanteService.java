package com.generation.avaliacao.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.avaliacao.repository.ParticipanteRepository;

@Service
public class ParticipanteService {
	
	@Autowired
	private ParticipanteRepository repository;
	
	
// serviço para implementar a logica de maior idade
	// ingetar instancia do participante repository
	// trazer o Usuario controller porque o service que chama o repository
	// tratar excessão personalizada para idade menos de 18 anos 
	/*try {
		diferencaData();
	}
	catch (ParseException e) {
		e.printStackTrace();
	}
	Period periodo = Period.between(dataCadastro, dataNasc)*/
}
