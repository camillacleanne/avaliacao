package com.generation.avaliacao.model;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_participante")
public class Participante{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Campo não pode ser nulo ou vazio")
	@Size(min = 3, max = 50, message = "Tamanho incorreto, deverá conter no mínimo 3 e máximo 50 caracteres ")
	private String nome;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy") // verificar se altera logica do service
	@NotBlank(message= "Data de nascimento é obrigatória")
	private LocalDate dataNasc;

	@NotBlank(message = "Campo não pode ser nulo ou vazio")
	private String periodo;

	@NotBlank(message = "Campo não pode ser nulo ou vazio")
	private String tipoCurso;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCadastro = LocalDate.now(); //java.sql.Date(System.currentTimeMillis()); // assim que passar o objeto pela classe calcula data e hora
	
	
	private boolean maiorIdade;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public LocalDate getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getPeriodo() {
		return periodo;
	}


	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}


	public String getTipoCurso() {
		return tipoCurso;
	}


	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}


	public LocalDate getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public boolean isMaiorIdade() {
		return maiorIdade;
	}


	public void setMaiorIdade(boolean maiorIdade) {
		this.maiorIdade = maiorIdade;
	}

	


	

}