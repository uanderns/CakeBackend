package com.cakedeliver.cakedeliver.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import com.cakedeliver.cakedeliver.entities.Sabor;

public class SaborDTO {

	private Long idSabor;
	private String nome;
	private String descricao;
	private String imagemUrl;

	private List<BoloDTO> bolos = new ArrayList<>();

	public SaborDTO() {

	}

	public SaborDTO(Long idSabor, String nome, String descricao, String imagemUrl) {
		super();
		this.idSabor = idSabor;
		this.nome = nome;
		this.descricao = descricao;
		this.imagemUrl = imagemUrl;
	}

	public SaborDTO(Sabor entity) {

		idSabor = entity.getIdSabor();
		nome = entity.getNome();
		descricao = entity.getDescricao();
		imagemUrl = entity.getImagemUrl();
		//bolos = entity.getBolo().stream().map(x -> new BoloDTO(x)).collect(Collectors.toList());
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

	public List<BoloDTO> getBolos() {
		return bolos;
	}

	

}
