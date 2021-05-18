package com.cakedeliver.cakedeliver.entities.atores;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Usuario implements Serializable{
	
	private static final long serialVersionUID = -1L;

	private Date dataAdmissao;
	private Date dataDemissao;

	public Funcionario(Long id, String nome, String email, String senha, Integer telefone, Integer cpf, Date dataNascimento, GeneroStatus genero, Boolean ativo, Date dataAdmissao, Date dataDemissao) {
		
    super(id, nome, email, senha, telefone, cpf, dataNascimento, genero, ativo);
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;	
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}
}