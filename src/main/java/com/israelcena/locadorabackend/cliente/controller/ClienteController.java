package com.israelcena.locadorabackend.cliente.controller;

import com.israelcena.locadorabackend.cliente.dto.ClienteDTO;
import com.israelcena.locadorabackend.cliente.model.Cliente;
import com.israelcena.locadorabackend.cliente.service.CreateNewClientService;
import com.israelcena.locadorabackend.cliente.service.DeleteClienteService;
import com.israelcena.locadorabackend.cliente.service.FindClienteService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping ("/cliente")
@RestController
@RequiredArgsConstructor
public class ClienteController {

  private final FindClienteService findClienteService;
  private final CreateNewClientService createNewClientService;
  private final DeleteClienteService deleteClienteService;
  private final ModelMapper modelMapper;

  public ClienteDTO convertCliente(Cliente cliente) {
    return modelMapper.map(cliente, ClienteDTO.class);
  }

  @GetMapping
  public List<ClienteDTO> listarTodos(){
    List<Cliente> allClientes = findClienteService.listarTodosOsClientes();
    return allClientes.stream().map(this::convertCliente).collect(Collectors.toList());
  }

  @PostMapping@ResponseStatus(HttpStatus.CREATED) @ResponseBody
  public ClienteDTO criarNovoCliente(@RequestBody Cliente cliente) {
    Cliente novoCliente = createNewClientService.criarNovoCliente(cliente);
    return convertCliente(novoCliente);
  }

  @DeleteMapping("{cpf}") @ResponseStatus(HttpStatus.ACCEPTED)
  public String deleteCliente(@PathVariable String cpf) {
    deleteClienteService.deleteCliente(cpf);
    return "Cliente Deletado";
  }

}
