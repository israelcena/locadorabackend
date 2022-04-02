package com.israelcena.locadorabackend.cliente.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/cliente/healthcheck")
@RestController
public class HealthCheck {

  @GetMapping
  public String healthCheck(){
    return "This Server is Alive !";
  }

  @PostMapping @ResponseStatus( HttpStatus.OK )
  public void postCheck(){}
}
