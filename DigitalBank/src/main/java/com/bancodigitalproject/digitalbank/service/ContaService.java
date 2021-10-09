package com.bancodigitalproject.digitalbank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancodigitalproject.digitalbank.model.Conta;
import com.bancodigitalproject.digitalbank.repository.ContaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository contaRepository;

	public Conta encontrarConta(String numero) throws ObjectNotFoundException {
		Optional<Conta> conta =contaRepository.findByNumero(numero);
		
		return conta.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Numero da Conta: " + numero + ", Tipo"+ ContaService.class.getName()));
	}

}
