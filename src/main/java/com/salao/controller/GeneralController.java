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

import com.salao.domain.Cliente;
import com.salao.repository.ClienteRepository;


@RestController
@RequestMapping("/salao")
@Transactional
public class GeneralController {

	@Autowired
	private ClienteRepository crepository;
	
	@CrossOrigin
	@GetMapping("/clientes")
	public Iterable<Cliente> findClientes(){
		return crepository.findAll();
	}
	
	@CrossOrigin
	@PostMapping("/clientes")
	public ResponseEntity<Cliente> cadastraCliente(@RequestBody Cliente cliente){
		System.out.println(cliente.getDataNascimento());
		crepository.save(cliente);
		return ResponseEntity.ok(cliente);
		
	}
	
	@CrossOrigin
	@DeleteMapping("/clientes/{id}")
	public ResponseEntity<Cliente> deletaCliente(@PathVariable("id") Long id){
		Cliente cliente = crepository.findOne(id);
		System.out.println(cliente.getNomeCliente());
		crepository.delete(id);
		return ResponseEntity.ok(cliente);
	}
	
	
}
