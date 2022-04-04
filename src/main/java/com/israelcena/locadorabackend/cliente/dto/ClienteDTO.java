package com.israelcena.locadorabackend.cliente.dto;

import com.israelcena.locadorabackend.filmes.dto.FilmesDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter @Setter
public class ClienteDTO {

  private String nome;
  private String cpf;
  private String endereco;
  private Boolean permicaoAlugar;
  private List<FilmesDTO> filmes;

}
