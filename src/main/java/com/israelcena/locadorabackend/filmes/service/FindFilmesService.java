package com.israelcena.locadorabackend.filmes.service;

import com.israelcena.locadorabackend.filmes.model.Filme;
import com.israelcena.locadorabackend.filmes.repository.FilmesReposiitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
public class FindFilmesService {

  private final FilmesReposiitory filmesReposiitory;

  public List<Filme> listarTodosFilmes() {
    return filmesReposiitory.findAll();
  }

  public Optional<Filme> listarUmFilme(Integer id) {
    Boolean exist = filmesReposiitory.existsById(id);
    if (!exist) {
      throw new IllegalStateException("O Filme Não Existe");
    }
    return filmesReposiitory.findById(id);
  }
}
