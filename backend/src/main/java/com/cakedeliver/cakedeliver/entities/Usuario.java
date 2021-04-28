package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


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
	
	
	
	
}
