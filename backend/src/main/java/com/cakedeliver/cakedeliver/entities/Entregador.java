package com.cakedeliver.cakedeliver.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_entregador")
public class Entregador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEntregador;
	private String docVeiculo;
	
	//@ManyToOne
	//private Pedido pedido;
	
	
	public Entregador() {
		
	}

	public Entregador(Long idEntregador, String docVeiculo) {
		super();
		this.idEntregador = idEntregador;
		this.docVeiculo = docVeiculo;
	}

	public Long getIdEntregador() {
		return idEntregador;
	}

	public void setIdEntregador(Long idEntregador) {
		this.idEntregador = idEntregador;
	}

	public String getDocVeiculo() {
		return docVeiculo;
	}

	public void setDocVeiculo(String docVeiculo) {
		this.docVeiculo = docVeiculo;
	}
	
	
	//public Pedido getPedido() {
		//return pedido;
	//}

	//public void setPedido(Pedido pedido) {
		//this.pedido = pedido;
	//}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEntregador == null) ? 0 : idEntregador.hashCode());
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
		Entregador other = (Entregador) obj;
		if (idEntregador == null) {
			if (other.idEntregador != null)
				return false;
		} else if (!idEntregador.equals(other.idEntregador))
			return false;
		return true;
	}
	
	
	

}
