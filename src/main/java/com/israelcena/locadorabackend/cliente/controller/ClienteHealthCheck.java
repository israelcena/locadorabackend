package com.israelcena.locadorabackend.cliente.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cliente/healthcheck")
@RestController
public class ClienteHealthCheck {
  @GetMapping
  public String healthCheck(){
    return "This Server is Alive !";
  }

}
