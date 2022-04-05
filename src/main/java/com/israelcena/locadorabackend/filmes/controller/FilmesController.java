package com.israelcena.locadorabackend.filmes.controller;

import com.israelcena.locadorabackend.filmes.dto.FilmesDTO;
import com.israelcena.locadorabackend.filmes.model.Filme;
import com.israelcena.locadorabackend.filmes.service.FindFilmesService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController @RequestMapping("/filmes") @RequiredArgsConstructor
public class FilmesController {

  private final FindFilmesService findFilmesService;
  private final ModelMapper modelMapper;

  public FilmesDTO convertFilme(Filme filme){ return modelMapper.map(filme, FilmesDTO.class); }

  @GetMapping
  public List<FilmesDTO> listarTodosFilmes(){
    List<Filme> filmes = findFilmesService.listarTodosFilmes();
    return filmes.stream().map(this::convertFilme).collect(Collectors.toList());
  }

  @GetMapping(path = "{id}")
  public Filme listarUmFilme(@PathVariable Integer id) throws Exception {
    return findFilmesService.listarUmFilme(id)
        .orElse(null);
  }

}
