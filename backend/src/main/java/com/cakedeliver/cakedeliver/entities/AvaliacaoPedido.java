package com.cakedeliver.cakedeliver.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cakedeliver.cakedeliver.enums.ClassificacaoAvaliacao;

@Entity
@Table(name ="tb_avaliacao")
public class AvaliacaoPedido implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO) //auto incremento no banco
	private Long idAvaliacao;
	private String comentario;
	private ClassificacaoAvaliacao classificacao;
	
	
	//@OneToMany // uma avaliacao para muitos pedidos
	//private List <Pedido> pedido;

		
	public AvaliacaoPedido() {
		
	}
	
	public AvaliacaoPedido(Long idAvaliacao, String comentario, ClassificacaoAvaliacao classificacao) {
		super();
		this.idAvaliacao = idAvaliacao;
		this.comentario = comentario;
		this.classificacao = classificacao;
	}

	public Long getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(Long idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public ClassificacaoAvaliacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(ClassificacaoAvaliacao classificacao) {
		this.classificacao = classificacao;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAvaliacao == null) ? 0 : idAvaliacao.hashCode());
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
		AvaliacaoPedido other = (AvaliacaoPedido) obj;
		if (idAvaliacao == null) {
			if (other.idAvaliacao != null)
				return false;
		} else if (!idAvaliacao.equals(other.idAvaliacao))
			return false;
		return true;
	}	
	
}