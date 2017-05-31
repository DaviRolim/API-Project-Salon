package com.salao.service.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FuncionarioValorDtoService {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<FuncionarioValorDto> getFuncVal() {

		return em.createNativeQuery("select sum(valor) vlTotal, nome_funcionario nmFuncionario, sum((valor / 100) * comissao) comissao from servicos s, funcionario f, atendimento a where a.id_funcionario = f.id_funcionario and s.id_servico = a.id_servico group by nome_funcionario", "FuncionarioValorDtoMapping").getResultList();
	
	
	
	

	}
}
