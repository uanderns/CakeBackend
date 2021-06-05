package com.cakedeliver.cakedeliver.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.cakedeliver.cakedeliver.entities.Bolo;
import com.cakedeliver.cakedeliver.entities.Pedido;
import com.cakedeliver.cakedeliver.entities.TipoBolo;

public class TipoBoloDTO {
	
	private Long idTipo;
	private String nomeTipo;
	
	private List <BoloDTO> bolos;
	
	
	public TipoBoloDTO() {
		// TODO Auto-generated constructor stub
	}

	
	
	public TipoBoloDTO(Long idTipo, String nomeTipo) {
		super();
		this.idTipo = idTipo;
		this.nomeTipo = nomeTipo;
	}
	
public TipoBoloDTO(TipoBolo entity) {
		
		idTipo = entity.getIdTipo();
		nomeTipo = entity.getNomeTipo();
		//bolos = entity.getBolo().stream().map(x -> new BoloDTO(x)).collect(Collectors.toList());
	}




	public Long getIdTipo() {
		return idTipo;
	}


	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}


	public String getNomeTipo() {
		return nomeTipo;
	}


	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}


	public List<BoloDTO> getBolo() {
		return bolos;
	}


	
	
	

}
