package com.cakedeliver.cakedeliver.entities.atores;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.cakedeliver.cakedeliver.enums.GeneroStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass //para a heranças das classes que herdarao
public abstract class Usuario implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 50)
	@NotBlank(message = "Preencha com o Nome do Usuário")
	@Size(min = 2, max = 50, message = "O Nome do Usuário deve ter entre 2 e 50 caracteres")
	private String nome;
	
  @Column(length = 20)
	@NotBlank(message = "Preencha com o Email do Usuário")
	@Size(min = 2, max = 20, message = "O Email do Usuário deve ter entre 2 e 20 caracteres")
	private String email;
	
  @Column(length = 15)
	@NotBlank(message = "Preencha com a Senha do Usuário")
	@Size(min = 2, max = 15, message = "A Senha do Usuário deve ter entre 2 e 15 caracteres")
	private String senha;
	
	@NotNull(message = "O Usuário deve possuir no minímo um número de telefone")
	private Integer telefone;
	
	@Column(length = 11)
	@Size(min = 11, max = 11, message = "O CPF do Usuário deve conter 11 digitos")
	private Integer cpf;
		
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	
	private GeneroStatus genero;
  private Boolean ativo;

	public Usuario(Long id, String nome, String email, String senha, Integer telefone, Integer cpf, Date dataNascimento, GeneroStatus genero, Boolean ativo) {
		this.id = id;
		this.nome = nome;
    this.email = email;
    this.senha = senha;
		this.cpf = cpf;
		this.telefone = telefone;
    this.ativo = ativo;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}

	public Long getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

  public Long getEmail() {
		return this.email;
	}

  public Long getSenha() {
		return this.senha;
	}

	public Integer getTelefone() {
		return this.telefone;
	}

	public Integer getCpf() {
		return this.cpf;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public GeneroStatus getGenero() {
		return this.genero;
	}
  
  public Boolean isAtivo() {
		return this.ativo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}