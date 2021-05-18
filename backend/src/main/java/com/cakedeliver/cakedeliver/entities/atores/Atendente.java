package com.cakedeliver.cakedeliver.entities.atores;

public class Atendente extends Funcionario {

  public Atendente(Long id, String nome, String email, String senha, Integer telefone, Integer cpf, Date dataNascimento, GeneroStatus genero, Boolean ativo, Date dataAdmissao, Date dataDemissao) {
    
    super(id, nome, email, senha, telefone, cpf, dataNascimento, genero, ativo, dataAdmissao, dataDemissao);
  }
}