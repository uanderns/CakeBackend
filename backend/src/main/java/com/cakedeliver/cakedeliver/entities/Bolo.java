package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne // muitos bolos para um tipo
	@JoinColumn(name="tipobolo",nullable=false)
	private TipoBolo tipobolo;
	
	@ManyToOne  // muitos bolos para um sabor
	@JoinColumn(name="sabor",nullable=false)
	private Sabor sabor;
	
	@ManyToOne // muitos tamanhos para um bolo
    @JoinColumn(name ="tamanho", nullable = false)
	private Tamanho tamanho;
		

	public Bolo() {}

	public Bolo(Long idBolo, String nome, Double preco,Double tamanho) {
		super();
		this.idBolo = idBolo;
		this.nome = nome;
		this.preco = preco;
				
	}

	
	public Long getIdBolo() {
		return idBolo;
	}

	public void setIdBolo(Long idBolo) {
		this.idBolo = idBolo;
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
	
			
	public TipoBolo getTipobolo() {
		return tipobolo;
	}

	public void setTipobolo(TipoBolo tipobolo) {
		this.tipobolo = tipobolo;
	}

	public Sabor getSabor() {
		return sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
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