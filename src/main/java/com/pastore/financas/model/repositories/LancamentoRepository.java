package com.pastore.financas.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pastore.financas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
