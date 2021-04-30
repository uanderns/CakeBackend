package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cakedeliver.cakedeliver.enums.GeneroStatus;


@Entity
public abstract class Usuario implements Serializable {
	
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private Integer telefone;
	private Integer cpf;
	private String senha;
	private String email;
	private String endereco;
	private Date dataNascimento;
	private GeneroStatus genero;
	
	
	
	
}
