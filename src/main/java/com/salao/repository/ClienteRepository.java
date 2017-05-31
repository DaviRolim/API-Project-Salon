package com.salao.repository;

import org.springframework.data.repository.CrudRepository;

import com.salao.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
