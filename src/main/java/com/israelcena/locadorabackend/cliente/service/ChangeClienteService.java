package com.israelcena.locadorabackend.cliente.service;

import com.israelcena.locadorabackend.cliente.model.Cliente;
import com.israelcena.locadorabackend.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ChangeClienteService {

  private final ClienteRepository clienteRepository;

  public Cliente changeCliente (String cpf, Cliente cliente) {
    Cliente altCliente = clienteRepository.findByCpf(cpf).orElse(null);
    altCliente.setNome(cliente.getNome());
    altCliente.setCpf(cliente.getCpf());
    altCliente.setEndereco(cliente.getEndereco());
    altCliente.setFilmes(cliente.getFilmes());
    clienteRepository.save(altCliente);
    return altCliente;
  }

}
