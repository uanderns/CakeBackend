package com.cakedeliver.cakedeliver.dto;

import java.util.Date;

import com.cakedeliver.cakedeliver.entities.Cliente;

public class ClienteDTO {
	
	private Long idCliente;
	private Boolean ativo = true;
	private Date dataCadastro;
	
	public ClienteDTO() {
		
	}
	
public ClienteDTO(Cliente entity) {
	
		idCliente = entity.getIdCliente();
		ativo = entity.getAtivo();
		dataCadastro = entity.getDataCadastro();
		
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

}
