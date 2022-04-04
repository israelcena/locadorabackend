package com.israelcena.locadorabackend.filmes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/filmes/healthcheck")
@RestController
public class FilmesHealthCheck {

  @GetMapping
  public String healthCheckGet(){
    return "The Server is Alive!";
  }
}
