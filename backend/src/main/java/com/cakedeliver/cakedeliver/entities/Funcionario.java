package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Usuario implements Serializable{
	
	private static final long serialVersionUID = -1L;

	private Long idFuncionario;
	private String email;
	private String senha;
	private Date dataAdmissao;
	private Date dataDemissao;
	
	
	public Funcionario() {
		
	}


	public Funcionario(Long idFuncionario, String email, String senha, Date dataAdmissao, Date dataDemissao) {
		super();
		this.idFuncionario = idFuncionario;
		this.email = email;
		this.senha = senha;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
	}


	public Long getIdFuncionario() {
		return idFuncionario;
	}


	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
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


	public Date getDataDemissao() {
		return dataDemissao;
	}


	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((idFuncionario == null) ? 0 : idFuncionario.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (idFuncionario == null) {
			if (other.idFuncionario != null)
				return false;
		} else if (!idFuncionario.equals(other.idFuncionario))
			return false;
		return true;
	}

	

	
	
	

	
}
