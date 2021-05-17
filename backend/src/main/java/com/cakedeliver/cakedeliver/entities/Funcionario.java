package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Usuario implements Serializable{
	
	private static final long serialVersionUID = -1L;

	private String email;
	private String senha;
	private Date dataAdmissao;
	private Date dataDemissao;
	
	public Funcionario() {}

	public Funcionario(Boolean ativo, Date dataAdmissao, Date dataDemissao) {
		super();
		
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;	
	}
	
	public Funcionario(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
