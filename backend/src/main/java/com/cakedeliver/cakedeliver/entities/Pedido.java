package com.cakedeliver.cakedeliver.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cakedeliver.cakedeliver.enums.PedidoStatus;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //auto incremento no banco
	@Column(name="idpedido")
	private Long id;
	private String endereco;
	private Double latitude; //armazenar geolocalização
	private Double longitude; //armazenar geolocalização
	
	private Instant moment; //Instante em que o pedido foi feito
	private PedidoStatus status; //atributo da classe enum
	
	@ManyToMany //Annotation de relacionamento de muitos pra muitos
	@JoinTable(name = "tb_pedido_bolo", // tabela de associação
	joinColumns = @JoinColumn(name = "pedido_id"), //chave estrangeira
	inverseJoinColumns = @JoinColumn(name = "bolo_id")) 
	
	//@ManyToOne //muitos pedidos para uma avaliação
	//@JoinColumn(name="avaliacaopedido",nullable=false)
	//private AvaliacaoPedido avaliacaopedido;
	
	//@ManyToOne //muitos pedidos para um cancelamento
	//@JoinColumn(name="cancelamento",nullable=false)
	//private Cancelamento cancelamento;
	
	@OneToMany
	private List <Cliente> cliente;
	
	@OneToMany
	private List <Entregador> entregador;
		
	
	//para nao repetir os bolos no mesmo pedido
	private Set<Bolo> bolos = new HashSet<>();
	
	public Pedido() {}

	public Pedido(Long id, String endereco, Double latitude, Double longitude, Instant moment, PedidoStatus status) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
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

	public Set<Bolo> getBolos() {
		return bolos;
	}
	
	

	public void setBolos(Set<Bolo> bolos) {
		this.bolos = bolos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}