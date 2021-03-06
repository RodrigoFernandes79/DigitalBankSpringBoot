package com.bancodigitalproject.digitalbank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bancodigitalproject.digitalbank.model.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,String> {
	
	Optional<Cliente> findByCpf(String cpf);
}