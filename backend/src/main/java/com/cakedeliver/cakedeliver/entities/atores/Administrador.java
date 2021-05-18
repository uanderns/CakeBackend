package com.cakedeliver.cakedeliver.entities.atores;

public class Administrador extends Funcionario {

  public Administrador(Long id, String nome, String email, String senha, Integer telefone, Integer cpf, Date dataNascimento, GeneroStatus genero, Boolean ativo) {
    
    super(id, nome, email, senha, telefone, cpf, dataNascimento, genero, ativo, null, null);
  }

  public Usuario criarNovo() {

    return null;
  }

  public Boolean alterar(Usuario user) {
    return true;
  }
  
  public Boolean excluir(Usuario user) {
    return false;
  }
}
