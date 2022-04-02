package com.israelcena.locadorabackend.cliente.model;

import lombok.*;

import javax.persistence.*;

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

  private String endereco;

  @Column(nullable = false)
  private Boolean permicao_alugar = true;
}
