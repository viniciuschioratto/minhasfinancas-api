package com.chioratto.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chioratto.minhasfinancas.model.entity.Lancamentos;

public interface LancamentoRepository extends JpaRepository<Lancamentos, Long> {

}
