package com.cakedeliver.cakedeliver.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cakedeliver.cakedeliver.entities.Bolo;
import com.cakedeliver.cakedeliver.entities.Pedido;
import com.cakedeliver.cakedeliver.entities.Tamanho;

public class TamanhoDTO {

	private Long idTamanho;
	private Double tamanho;
	private List<BoloDTO> bolos = new ArrayList<>();
	
	public TamanhoDTO() {
		
	}

	public TamanhoDTO(Long idTamanho, Double tamanho) {
		super();
		this.idTamanho = idTamanho;
		this.tamanho = tamanho;
	}
	
	
public TamanhoDTO(Tamanho entity) {
		
		idTamanho = entity.getIdTamanho();
		tamanho = entity.getTamanho();
		//bolos = entity.getBolo().stream().map(x -> new BoloDTO(x)).collect(Collectors.toList());
		
	}
	

	public Long getIdTamanho() {
		return idTamanho;
	}

	public void setIdTamanho(Long idTamanho) {
		this.idTamanho = idTamanho;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}

	public List<BoloDTO> getBolos() {
		return bolos;
	}

	public void setBolos(List<BoloDTO> bolos) {
		this.bolos = bolos;
	}
	
	
	
	
	
}
