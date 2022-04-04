package com.israelcena.locadorabackend.filmes.service;

import com.israelcena.locadorabackend.filmes.model.Filme;
import com.israelcena.locadorabackend.filmes.repository.FilmesReposiitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class ListAllFilmesService {

  private final FilmesReposiitory filmesReposiitory;

  public List<Filme> listarTodosFilmes() {
    return filmesReposiitory.findAll();
  }
}
