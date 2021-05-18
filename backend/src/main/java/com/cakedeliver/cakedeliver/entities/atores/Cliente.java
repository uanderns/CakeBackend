package com.cakedeliver.cakedeliver.entities.atores;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente extends Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	private String endereco;
	private Date dataCadastro;
	
	@ManyToOne
	private Pedido pedido;

	public Cliente(Long id, String nome, String email, String senha, Integer telefone, Integer cpf, Date dataNascimento, GeneroStatus genero, Boolean ativo, Date dataCadastro, String endereco) {
		super(id, nome, email, senha, telefone, cpf, dataNascimento, genero, ativo);
		this.endereco = endereco;
		this.dataCadastro = dataCadastro;
	}

	public String getEndereco() {
		return endereco;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}
}