package com.GADS.av1as.enumeracoes;

public enum TipoVeiculo {
	CARRO(1), MOTO(2);

	private final int tipo;

	TipoVeiculo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getValue() {
		return this.tipo;
	}
}
