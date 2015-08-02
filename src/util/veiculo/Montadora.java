package util.veiculo;

public enum Montadora {
	CHEVROLET(1), FIAT(2), FORD(3), VOLKSWAGEN(4);

	private final int montadora;

	private Montadora(int montadora) {
		this.montadora = montadora;
	}

	public int getValue() {
		return this.montadora;
	}
}
