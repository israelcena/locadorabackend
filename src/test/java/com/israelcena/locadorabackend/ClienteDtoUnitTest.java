package com.israelcena.locadorabackend;

import com.israelcena.locadorabackend.cliente.dto.ClienteDTO;
import com.israelcena.locadorabackend.cliente.model.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteDtoUnitTest {

  private ModelMapper modelMapper = new ModelMapper();

  @Test
  public void whenConvertClienteEntityToClienteDto_thenCorrect() {
    Cliente cliente = new Cliente();
    cliente.setNome("Jonh");
    cliente.setCpf("321321");
    cliente.setEndereco("Rua Fulano de tal, 576");
    cliente.setPermicaoAlugar(true);

    ClienteDTO clienteDTO = modelMapper.map(cliente, ClienteDTO.class);
    Assertions.assertEquals(cliente.getNome(), clienteDTO.getNome());
    Assertions.assertEquals(cliente.getCpf(), clienteDTO.getCpf());
    Assertions.assertEquals(cliente.getEndereco(), clienteDTO.getEndereco());
    Assertions.assertEquals(cliente.getPermicaoAlugar(), clienteDTO.getPermicaoAlugar());

  }


}
