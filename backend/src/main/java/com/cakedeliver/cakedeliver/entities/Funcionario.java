package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.MappedSuperclass;

//@Entity
//@Table(name = "tb_funcionario")
@MappedSuperclass
public abstract class Funcionario extends Usuario implements Serializable {

	private static final long serialVersionUID = -1L;

	private String email;
	private String senha;
	private Date dataAdmissao;

	public Funcionario() {

	}

	public Funcionario(Long idFuncionario, String email, String senha, Date dataAdmissao) {
		super();
		;
		this.email = email;
		this.senha = senha;
		this.dataAdmissao = dataAdmissao;

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

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

}
