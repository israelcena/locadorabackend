package com.israelcena.locadorabackend.filmes.repository;

import com.israelcena.locadorabackend.filmes.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilmesReposiitory extends JpaRepository<Filme, Integer> {
  Optional<Filme> findByTituloAndAndDescricao(String titulo, String descricao);
}
