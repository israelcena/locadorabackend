package com.israelcena.locadorabackend.filmes.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FilmesDTO {

  private String titulo;
  private String descricao;
  private String genero;
  private Float nota;
  private Boolean disponibilidade = true;

}