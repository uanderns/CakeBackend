package com.cakedeliver.cakedeliver.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cakedeliver.cakedeliver.entities.Pedido;
import com.cakedeliver.cakedeliver.enums.PedidoStatus;



public class PedidoDTO {
	
	private Long id;
	private String endereco;
	private Double latitude; 
	private Double longitude; 
	
	private Instant moment; 
	private PedidoStatus status; 
	
	private List<BoloDTO> bolos = new ArrayList<>();
	
	
	public PedidoDTO() {
		
	}
	

	public PedidoDTO(Long id, String endereco, Double latitude, Double longitude, Instant moment, PedidoStatus status) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
	}
	
public PedidoDTO(Pedido entity) {
		
		id = entity.getId();
		endereco = entity.getEndereco();
		latitude = entity.getLatitude();
		longitude = entity.getLongitude();
	    moment = entity.getMoment();
		status = entity.getStatus();
		//bolos = entity.getBolos().stream().map(x -> new BoloDTO(x)).collect(Collectors.toList());
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public List<BoloDTO> getBolos() {
		return bolos;
	}

	

	
	
	
}
