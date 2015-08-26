package com.GADS.av1as.enumeracoes;

public enum CarroMontadora {
	CHEVROLET(1), FIAT(2), FORD(3), VOLKSWAGEN(4);

	private final int montadora;

	private CarroMontadora(int montadora) {
		this.montadora = montadora;
	}

	public int getValue() {
		return this.montadora;
	}
}
