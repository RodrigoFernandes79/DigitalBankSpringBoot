package com.bancodigitalproject.digitalbank.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ContaType {
		
	CORRENTE("Corrente"),
	POUPANÇA("Poupança");
	
	public final String description;
	
}
