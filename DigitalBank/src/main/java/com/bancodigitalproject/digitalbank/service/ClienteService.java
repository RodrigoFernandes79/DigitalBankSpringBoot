package com.bancodigitalproject.digitalbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bancodigitalproject.digitalbank.model.Cliente;
import com.bancodigitalproject.digitalbank.repository.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente listarCpf(String cpf) throws ObjectNotFoundException {
		Optional<Cliente> cl = clienteRepository.findByCpf(cpf);
		return cl.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! CPF: " + cpf + ", Tipo"+ ClienteService.class.getName()));
	}

	
	

	
	}

	
	

	
	


