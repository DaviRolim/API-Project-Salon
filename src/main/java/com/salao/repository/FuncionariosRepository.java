package com.salao.repository;

import org.springframework.data.repository.CrudRepository;

import com.salao.domain.Funcionario;

public interface FuncionariosRepository extends CrudRepository<Funcionario,Long> {

}
