package com.salao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.salao.domain.Atendimento;
import com.salao.domain.Cliente;
import com.salao.domain.Servicos;

public interface AtendimentoRepository extends CrudRepository<Atendimento, Long>{
	
	List<Atendimento> findByCliente(Cliente cliente);
	
	List<Atendimento> findByServicos(Servicos servicos);

}
