package com.cakedeliver.cakedeliver.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_cancelamento")
public class Cancelamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO) //auto incremento no banco
	private Long idCancelamento;
	private String motivo;
		
	
	//@OneToMany // muitos pedido para um cancelamento
	//private  List <Pedido> pedido;
	
	public Cancelamento() {
		
	}
	
	public Cancelamento(Long idCancelamento, String motivo) {
		super();
		this.idCancelamento = idCancelamento;
		this.motivo = motivo;
	}


	@Override
	public String toString() {
		return "Cancelamento [idCancelamento=" + idCancelamento + ", motivo=" + motivo + "]";
	}


	public Long getIdCancelamento() {
		return idCancelamento;
	}


	public void setIdCancelamento(Long idCancelamento) {
		this.idCancelamento = idCancelamento;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	

	


}
