package com.israelcena.locadorabackend.cliente.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ClienteDTO {

  private String nome;
  private String cpf;
  private String endreco;
  private boolean permicao_alugar;

}
