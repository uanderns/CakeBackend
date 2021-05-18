package com.cakedeliver.cakedeliver.entities.atores;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_entregador")
public class Entregador extends Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer documentoVeiculo;
	private Date dataAdmissao;
	
	@ManyToOne
	private Pedido pedido;

	public Entregador(Long id, String nome, String email, String senha, Integer telefone, Integer cpf, Date dataNascimento, GeneroStatus genero, Boolean ativo, Date dataAdmissao, Integer documentoVeiculo) {
		
    super(id, nome, email, senha, telefone, cpf, dataNascimento, genero, ativo);

		this.documentoVeiculo = documentoVeiculo;
		this.dataAdmissao = dataAdmissao;
	}

	public String getDocumentoVeiculo() {
		return this.documentoVeiculo;
	}

	public Date getDataAdmissao() {
		return this.dataAdmissao;
	}
}