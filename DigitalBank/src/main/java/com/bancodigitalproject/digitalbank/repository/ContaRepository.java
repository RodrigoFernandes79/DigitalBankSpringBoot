package com.bancodigitalproject.digitalbank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancodigitalproject.digitalbank.model.Banco;
import com.bancodigitalproject.digitalbank.model.Conta;
@Repository
public interface ContaRepository extends JpaRepository<Conta,String> {
	
	Optional<Conta> findByNumero(String numero);

}
