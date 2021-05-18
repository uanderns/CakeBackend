package com.cakedeliver.cakedeliver.entities.bolo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_bolo")
public class Bolo extends Util implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremento no banco
	
	private Long id;
	private String nome;
	private Double preco;
	private String imagemUrl;
	private Tamanho tamanho;
	private TipoBolo tipo;
	private Sabor sabor;

	public Bolo(Long id, String nome, Double preco, String imagemUrl, Tamanho tamanho, TipoBolo tipo, Sabor sabor) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.imagemUrl = imagemUrl;
		this.tamanho = tamanho;
    this.tipo = tipo;
    this.sabor = sabor;
	}

	public Long getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public Double getPreco() {
		return this.preco;
	}

	public String getImagemUrl() {
		return this.imagemUrl;
	}
  
	public Tamanho getTamanho() {
		return this.tamanho;
	}

	public TipoBolo getTipo() {
		return this.tipo;
	}

	public Sabor getSabor() {
		return this.sabor;
	}
}