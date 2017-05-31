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

import com.salao.domain.Servicos;
import com.salao.repository.ServicosRepository;

@RestController
@RequestMapping("/salao")
@Transactional
public class ServicosController {
	
	@Autowired
	private ServicosRepository servicosRepository;
	
	@CrossOrigin
	@GetMapping("/servicos")
	public Iterable<Servicos> findClientes(){
		return servicosRepository.findAll();
	}
	
	@CrossOrigin
	@PostMapping("/servicos")
	public ResponseEntity<Servicos> cadastraCliente(@RequestBody Servicos Servicos){
		servicosRepository.save(Servicos);
		return ResponseEntity.ok(Servicos);
		
	}
	
	@CrossOrigin
	@DeleteMapping("/servicos/{id}")
	public ResponseEntity<Servicos> deletaCliente(@PathVariable("id") Long id){
		Servicos servicos = servicosRepository.findOne(id);
		System.out.println(servicos.getNomeServico());
		servicosRepository.delete(id);
		return ResponseEntity.ok(servicos);
	}


}
