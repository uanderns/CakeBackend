package com.cakedeliver.cakedeliver.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tamanho")
public class Tamanho {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremento no banco
 	private Long idTamanho;
	
	private Double tamanho;
	
	
	@ManyToOne // muitos tamanhos para um bolo
	@JoinColumn(name ="idbolo", nullable = false)
	private Bolo bolo;
	
	public Tamanho() {
		
	}

	public Tamanho(Long idTamanho, Double tamanho) {
		super();
		this.idTamanho = idTamanho;
		this.tamanho = tamanho;
	}

	public Long getIdTamanho() {
		return idTamanho;
	}

	public void setIdTamanho(Long idTamanho) {
		this.idTamanho = idTamanho;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}

	public Bolo getBolo() {
		return bolo;
	}

	public void setBolo(Bolo bolo) {
		this.bolo = bolo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTamanho == null) ? 0 : idTamanho.hashCode());
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
		Tamanho other = (Tamanho) obj;
		if (idTamanho == null) {
			if (other.idTamanho != null)
				return false;
		} else if (!idTamanho.equals(other.idTamanho))
			return false;
		return true;
	}
	
	
	
	
}