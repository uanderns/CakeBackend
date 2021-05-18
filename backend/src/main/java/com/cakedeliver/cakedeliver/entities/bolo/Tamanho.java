package com.cakedeliver.cakedeliver.entities.bolo;

public class Tamanho extends Util {

  private Integer id;	
	private Double tamanho;

  public Bolo(Long id, Double tamanho) {
    this.id = id;
    this.tamanho = tamanho;
  }

  
  public Integer getId() {
    return this.id;
  }
  
  public Double getTamanho() {
    return this.tamanho;
  }
}