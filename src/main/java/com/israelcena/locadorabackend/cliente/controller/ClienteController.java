package com.israelcena.locadorabackend.cliente.controller;

import com.israelcena.locadorabackend.cliente.model.Cliente;
import com.israelcena.locadorabackend.cliente.service.CreateNewClientService;
import com.israelcena.locadorabackend.cliente.service.FindClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("/cliente")
@RestController
@RequiredArgsConstructor
public class ClienteController {

  private final FindClienteService findClienteService;
  private final CreateNewClientService createNewClientService;

  @GetMapping
  public List<Cliente> listarTodos(){
    return findClienteService.listarTodosOsClientes();
  }

  @PostMapping
  public Cliente criarNovoCliente(@RequestBody Cliente cliente) {
    createNewClientService.criarNovoCliente(cliente);
    return cliente;
  }

}
