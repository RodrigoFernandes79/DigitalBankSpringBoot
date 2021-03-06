package com.bancodigitalproject.digitalbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bancodigitalproject.digitalbank.model.Cliente;
import com.bancodigitalproject.digitalbank.repository.ClienteRepository;
import com.bancodigitalproject.digitalbank.service.ClienteService;

import javassist.tools.rmi.ObjectNotFoundException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/listcliente") //localhost:8095/listcliente
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private ClienteRepository clienteRepository;

	//Creating Cliente:
	
	@PostMapping
	public ResponseEntity<Cliente> createCLiente(@RequestBody Cliente cliente){
		return ResponseEntity.ok(clienteRepository.save(cliente));
		
	}
	
	@GetMapping
	public ResponseEntity<List<Cliente>>listarCliente(){
		return ResponseEntity.ok(clienteRepository.findAll());
		
	}
	@GetMapping("/{cpf}") //localhost:8095/listcliente/{cpf}
	public ResponseEntity<Cliente> listarCpf(@PathVariable  String cpf) throws ObjectNotFoundException {
		Cliente obj= clienteService.listarCpf(cpf);
		return ResponseEntity.ok().body(obj);
				
		
	}
	
}
