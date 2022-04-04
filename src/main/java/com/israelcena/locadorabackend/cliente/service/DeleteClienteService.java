package com.israelcena.locadorabackend.cliente.service;

import com.israelcena.locadorabackend.cliente.model.Cliente;
import com.israelcena.locadorabackend.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service @RequiredArgsConstructor
public class DeleteClienteService {

  private final ClienteRepository clienteRepository;

  public void deleteCliente(String cpf){
    Cliente cliente = clienteRepository.findByCpf(cpf).orElse(null);
    clienteRepository.delete(cliente);
  }

}
