package com.generation.avaliacao.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {
// mandar o erro real para o cliente no navegador atraves do manipulador
	
	@ExceptionHandler(value = {ApiRequestException.class} ) // qual exceçaõ 
	public ResponseEntity<Object> handleParticipanteRequestException(ApiRequestException e){
		//1. Criar payload contendo os detalhes da excessão
		HttpStatus badRequest = HttpStatus.BAD_REQUEST;
		
		ApiException apiExeption = new ApiException(
				e.getMessage(),
				e,
				badRequest,
				ZonedDateTime.now(ZoneId.of("Z"))
		
				);
	
		//2. retornar response entity
		return new ResponseEntity<>(apiExeption, badRequest);
	}
}
