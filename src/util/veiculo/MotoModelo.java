package util.veiculo;

public enum MotoModelo {
	ESTRADEIRA(1), NORMAL(2), OFFROAD(3), ESPORTIVA(4);

	private final int modelo;

	MotoModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getValue() {
		return this.modelo;
	}
}
