package com.salao.controller;

import java.util.List;

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

import com.salao.domain.Funcionario;
import com.salao.repository.FuncionariosRepository;
import com.salao.service.dto.FuncionarioValorDto;
import com.salao.service.dto.FuncionarioValorDtoService;

@RestController
@RequestMapping("/salao")
@Transactional
public class FuncionarioController {
	
	@Autowired
	private FuncionariosRepository funcionarioRepository;
	
	@Autowired
	private FuncionarioValorDtoService funcionarioService;
	
	@CrossOrigin
	@GetMapping("/funcionarios")
	public Iterable<Funcionario> findClientes(){
		return funcionarioRepository.findAll();
	}
	
	@CrossOrigin
	@PostMapping("/funcionarios")
	public ResponseEntity<Funcionario> cadastraCliente(@RequestBody Funcionario funcionario){
		funcionarioRepository.save(funcionario);
		return ResponseEntity.ok(funcionario);
		
	}
	
	@CrossOrigin
	@DeleteMapping("/funcionarios/{id}")
	public ResponseEntity<Funcionario> deletaCliente(@PathVariable("id") Long id){
		Funcionario funcionario = funcionarioRepository.findOne(id);
		System.out.println(funcionario.getNomeFuncionario());
		funcionarioRepository.delete(id);
		return ResponseEntity.ok(funcionario);
	}
	
	@CrossOrigin
	@GetMapping("/funcionarios/financas")
	public List<FuncionarioValorDto> findFuncVal(){
		return funcionarioService.getFuncVal();
	}

}
