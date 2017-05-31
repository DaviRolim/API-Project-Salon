package com.salao.repository;

import org.springframework.data.repository.CrudRepository;

import com.salao.domain.Produtos;

public interface ProdutosRepository extends CrudRepository<Produtos, Long> {

}
