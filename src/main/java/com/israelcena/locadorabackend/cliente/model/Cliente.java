package com.israelcena.locadorabackend.cliente.model;

import com.israelcena.locadorabackend.cliente.dto.ClienteDTO;
import com.israelcena.locadorabackend.filmes.model.Filme;
import lombok.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity (name = "cliente")
@Getter
@Setter
public class Cliente {

  @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false, unique = true)
  private String cpf;

  @Column(nullable = false)
  private String endereco;

  @Column(nullable = false)
  private Boolean permicao_alugar = true;

  @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
  private List<Filme> filmes;

}
