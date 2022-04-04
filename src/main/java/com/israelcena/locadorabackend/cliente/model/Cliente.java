package com.israelcena.locadorabackend.cliente.model;

import com.israelcena.locadorabackend.filmes.model.Filme;
import lombok.*;
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

  @Column(nullable = false, name = "permicao_alugar")
  private Boolean permicaoAlugar = true;

  @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
  private List<Filme> filmes;

}
