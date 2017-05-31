package com.salao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salao.domain.Atendimento;
import com.salao.domain.Cliente;
import com.salao.domain.Funcionario;
import com.salao.domain.Servicos;
import com.salao.repository.AtendimentoRepository;
import com.salao.repository.ClienteRepository;
import com.salao.repository.FuncionariosRepository;
import com.salao.repository.ServicosRepository;
@RestController
@RequestMapping("/salao")
@Transactional
public class AtendimentoController {

	@Autowired
	private AtendimentoRepository atendimentoRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private FuncionariosRepository funcionarioRepository;

	@Autowired
	private ServicosRepository servicosRepository;

	@CrossOrigin
	@GetMapping("/atendimentos")
	public Iterable<Atendimento> findClientes(){
		return atendimentoRepository.findAll();
	}
	
	@CrossOrigin
	@PostMapping("/atendimentos")
	public ResponseEntity<Atendimento> registraAtendimento(@RequestBody Atendimento atendimento){
		System.out.println(atendimento.getCliente().getNomeCliente());
		System.out.println(atendimento.getCliente().getIdCliente());
		System.out.println("teste");
		System.out.println(atendimento.getServicos().getIdServico());
		System.out.println("teste2");
		Cliente cliente = clienteRepository.findOne(atendimento.getCliente().getIdCliente());
		Funcionario funcionario = funcionarioRepository.findOne(atendimento.getFuncionario().getIdFuncionario());
		Servicos servico = servicosRepository.findOne(atendimento.getServicos().getIdServico());
		Atendimento ate = new Atendimento();
		ate.setCliente(cliente);
		ate.setFuncionario(funcionario);
		ate.setServicos(servico);
		ate.setData_atendimento(atendimento.getData_atendimento());
		atendimentoRepository.save(ate);
		return ResponseEntity.ok(ate);
		
	}
	
	@CrossOrigin
	@DeleteMapping("/atendimentos/{id}")
	public ResponseEntity<Atendimento> deletaCliente(@PathVariable("id") Long id){
		Atendimento atendimento = atendimentoRepository.findOne(id);
		System.out.println(atendimento.getCliente().getNomeCliente());
		atendimentoRepository.delete(id);
		return ResponseEntity.ok(atendimento);
	}
}
