package com.israelcena.locadorabackend.filmes.model;

import com.israelcena.locadorabackend.cliente.model.Cliente;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Filme {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column (nullable = false)
  private String titulo;

  @Column(length = 100)
  private String descricao;

  private String genero;

  private Float nota;

  private Boolean disponibilidade = true;

  @ManyToOne
  @JoinColumn(name = "cliente_id")
  private Cliente cliente;
}
