package com.bancodigitalproject.digitalbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancodigitalproject.digitalbank.model.Conta;
import com.bancodigitalproject.digitalbank.repository.ContaRepository;
import com.bancodigitalproject.digitalbank.service.ContaService;

import javassist.tools.rmi.ObjectNotFoundException;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/listconta") //localhost:8095/listconta
public class ContaController {
	
	@Autowired
	public ContaService contaService;
	
	@Autowired
	public ContaRepository contaRepository;
	
	//Criar método conta:
	
	@PostMapping
	public ResponseEntity<Conta> createConta(@RequestBody Conta conta){
		return ResponseEntity.ok().body(contaRepository.save(conta));
		
	}
	
	@GetMapping // localhost:8095/listconta
	public ResponseEntity <List<Conta>> listarConta(){
		return ResponseEntity.ok().body(contaRepository.findAll());
		
}
	@GetMapping("/{numero}") //localhost:8095/listconta/numero
	public ResponseEntity <Conta> encontrarConta(@PathVariable String numero) throws ObjectNotFoundException  {
	Conta obj = contaService.encontrarConta(numero);
		return ResponseEntity.ok().body(obj);
		
}
}