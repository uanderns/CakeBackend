package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_bolo")
public class TipoBolo extends Util implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	public TipoBolo(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}
}