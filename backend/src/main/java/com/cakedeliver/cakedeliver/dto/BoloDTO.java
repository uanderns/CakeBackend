package com.cakedeliver.cakedeliver.dto;

import com.cakedeliver.cakedeliver.entities.Bolo;

public class BoloDTO {
	
	private Long idBolo;
	private String nome;
	private Double preco;
	
public BoloDTO() {
	
}

public BoloDTO(Long idBolo, String nome, Double preco) {
	super();
	this.idBolo = idBolo;
	this.nome = nome;
	this.preco = preco;
}

public BoloDTO(Bolo entity) {
	
	idBolo = entity.getIdBolo();
	nome = entity.getNome();
    preco = entity.getPreco();
	
}

public Long getIdBolo() {
	return idBolo;
}

public void setIdBolo(Long idBolo) {
	this.idBolo = idBolo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Double getPreco() {
	return preco;
}

public void setPreco(Double preco) {
	this.preco = preco;
}




}
