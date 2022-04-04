package com.israelcena.locadorabackend.filmes.controller;

import com.israelcena.locadorabackend.filmes.dto.FilmesDTO;
import com.israelcena.locadorabackend.filmes.model.Filme;
import com.israelcena.locadorabackend.filmes.service.ListAllFilmesService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController @RequestMapping("/filmes") @RequiredArgsConstructor
public class FilmesController {

  private final ListAllFilmesService listAllFilmesService;
  private final ModelMapper modelMapper;

  public FilmesDTO convertFilme(Filme filme){ return modelMapper.map(filme, FilmesDTO.class); }

  @GetMapping
  public List<FilmesDTO> listarTodosFilmes(){
    List<Filme> filmes = listAllFilmesService.listarTodosFilmes();
    return filmes.stream().map(this::convertFilme).collect(Collectors.toList());
  }


}
