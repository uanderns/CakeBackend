package com.cakedeliver.cakedeliver.entities;

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
public class Usuario implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 50)
	@NotBlank(message = "Preencha com o Nome do Usuário")
	@Size(min = 2, max = 50, message = "O Nome do Usuário deve ter entre 2 e 50 caracteres")
	private String nome;
	
		
	@NotNull(message = "O Usuário deve possuir no minímo um número de telefone")
	private Integer telefone;
	
	@Column(length = 11, unique = true)
	@Size(min = 11, max = 11, message = "O CPF do Usuário deve conter 11 digitos")
	private Integer cpf;
		
	private String endereco;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	
	private GeneroStatus genero;
	
	public Usuario() {}

	public Usuario(Long id, String nome, Integer telefone, Integer cpf, String endereco, Date dataNascimento, GeneroStatus genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public GeneroStatus getGenero() {
		return genero;
	}

	public void setGenero(GeneroStatus genero) {
		this.genero = genero;
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