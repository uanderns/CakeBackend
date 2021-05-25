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
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremento no banco
	private Long idCancelamento;
	private String motivo;
	
	
	//@OneToMany // muitos pedido para um cancelamento
	//private  List <Pedido> pedido;



}
