package com.generation.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.generation.avaliacao.model.Participante;
import com.generation.avaliacao.repository.ParticipanteRepository;
import com.generation.avaliacao.service.ParticipanteService;

//IMPLEMENTAR ENDPOINTS DA APIREST
@RestController
@RequestMapping("/participante")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class ParticipanteController {

	//para cada metodo criar um metodo no service para acrescentar a camada de regra
	
	@Autowired
	private ParticipanteService participanteService;

	@Autowired
	private ParticipanteRepository repository;

	@GetMapping
	public ResponseEntity<List<Participante>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Participante> getById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());

	}

//criar um getmapping para lançar a excessão
	@PostMapping
	public ResponseEntity<Participante> post(@RequestBody Participante participante) {
		return ResponseEntity.status(HttpStatus.CREATED).body(participanteService.save(participante));
	}

	@PutMapping
	public ResponseEntity<Participante> put(@RequestBody Participante participante) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(participante));
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
