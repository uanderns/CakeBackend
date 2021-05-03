package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_cliente")
public class Cliente extends Usuario implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	
	
	
	private Boolean ativo = true;
	private Date dataCadastro;
	private String senha;
	private String email;
	
	@ManyToOne
	private Pedido pedido;
	
	
	
	
	public Cliente() {
		
	}
		

	public Cliente(String senha, String email) {
		super();
		this.senha = senha;
		this.email = email;
	}



	public Cliente( Boolean ativo, Date dataCadastro) {
		super();
		
		this.ativo = ativo;
		this.dataCadastro = dataCadastro;
		
		
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
	
	
	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	
	
}
