package com.bancodigitalproject.digitalbank.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.bancodigitalproject.digitalbank.enumerate.ContaType;


import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="contas")
public class Conta {
	
	
	private String agencia;
	@Id
	@Column(unique=true)
	private String numero;
	
	private Double saldo;
	@ManyToOne
	@JoinColumn(name ="cliente_cpf")
	private Cliente cliente;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Banco banco;
	
	@Enumerated(EnumType.STRING)
	@Column
	private ContaType tipoConta; 

}

