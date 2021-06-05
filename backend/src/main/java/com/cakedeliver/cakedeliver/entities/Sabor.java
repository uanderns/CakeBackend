package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name ="tb_sabor")
public class Sabor implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSabor;
	
	private String nome;
	private String descricao;
	private String imagemUrl;
	
	//@OneToMany(mappedBy = "sabor") // um sabor para muitos bolos
	//@JsonIgnore
	//private List <Bolo> bolos;
	
	public Sabor() {
		
	}
	
	
	public Sabor(Long idSabor, String nome, String descricao, String imagemUrl) {
		super();
		this.idSabor = idSabor;
		this.nome = nome;
		this.descricao = descricao;
		this.imagemUrl = imagemUrl;
	}



	public Long getIdSabor() {
		return idSabor;
	}

	public void setIdSabor(Long idSabor) {
		this.idSabor = idSabor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}
	
	
	//public List<Bolo> getBolo() {
		//return bolos;
	//}


	//public void setBolo(List<Bolo> bolo) {
		//this.bolos = bolo;
	//}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSabor == null) ? 0 : idSabor.hashCode());
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
		Sabor other = (Sabor) obj;
		if (idSabor == null) {
			if (other.idSabor != null)
				return false;
		} else if (!idSabor.equals(other.idSabor))
			return false;
		return true;
	}


	



	
	
	
}