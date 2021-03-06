package com.israelcena.locadorabackend.cliente.service;

import com.israelcena.locadorabackend.cliente.model.Cliente;
import com.israelcena.locadorabackend.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FindClienteService {

  private final ClienteRepository clienteRepository;

  public List<Cliente> listarTodosOsClientes() {
    List<Cliente> todosClientes = clienteRepository.findAll();
    return todosClientes.stream().collect(Collectors.toList());
  }

  public Cliente listarUmCliente(String cpf){
    return clienteRepository.findByCpf(cpf).orElse(null);
  }

}