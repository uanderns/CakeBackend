package com.cakedeliver.cakedeliver.entities.bolo;

public class Sabor extends Util {

  private Integer id;
	private String sabor;
  private String descricao;

  public Sabor(Long id, String sabor, String descricao) {
    this.id = id;
    this.sabor = sabor;
    this.descricao = descricao;
  }

  public Integer getId() {
    return this.id;
  }
  
  public String getSabor() {
    return this.sabor;
  }

  public String getDescricao() {
    return this.descricao;
  }
}