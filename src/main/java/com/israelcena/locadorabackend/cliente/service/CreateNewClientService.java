package com.israelcena.locadorabackend.cliente.service;

import com.israelcena.locadorabackend.cliente.model.Cliente;
import com.israelcena.locadorabackend.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateNewClientService {

  private final ClienteRepository clienteRepository;

  public Cliente criarNovoCliente(Cliente cliente) {
    return clienteRepository.save(cliente);
  }
}
