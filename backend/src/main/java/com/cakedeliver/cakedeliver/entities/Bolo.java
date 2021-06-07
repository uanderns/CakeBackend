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
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO) //auto incremento no banco
	@Column(name="idbolo")
	private Long idBolo;
	private String nome;
	private Double preco;
	
	
	// Bolo pertence a 1 sabor
	@ManyToOne  // muitos bolos para um sabor
	@JoinColumn(name="idsabor",nullable=false)
    private Sabor sabor;
	
		

	public Bolo() {}

		
	
	public Bolo(Long idBolo, String nome, Double preco, Sabor sabor) {
		super();
		this.idBolo = idBolo;
		this.nome = nome;
		this.preco = preco;
		this.sabor = sabor;
	}


	@Override
	public String toString() {
		return "Bolo [idBolo=" + idBolo + ", nome=" + nome + ", preco=" + preco + "]";
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
	

	public Sabor getSabore() {
		return sabor;
	}



	public void setSabore(Sabor sabor) {
		this.sabor = sabor;
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