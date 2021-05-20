package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_bolo")
public class Bolo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremento no banco
	@Column(name="idbolo")
	private Long idBolo;
	
	private String nome;
	private Double preco;
	
	@OneToMany // um bolo para muitos tipos
	private List <TipoBolo> tipobolo;
	
	@OneToOne  // um bolo para um sabor
	private Sabor sabor;
	
	@OneToMany //um bolo para varios sabores
	private List <Tamanho> tamanho;
		

	public Bolo() {}

	public Bolo(Long idBolo, String nome, Double preco,Double tamanho) {
		super();
		this.idBolo = idBolo;
		this.nome = nome;
		this.preco = preco;
				
	}

	public Long getId() {
		return idBolo;
	}

	public void setId(Long id) {
		this.idBolo = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idBolo == null) ? 0 : idBolo.hashCode());
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
		Bolo other = (Bolo) obj;
		if (idBolo == null) {
			if (other.idBolo != null)
				return false;
		} else if (!idBolo.equals(other.idBolo))
			return false;
		return true;
	}
}