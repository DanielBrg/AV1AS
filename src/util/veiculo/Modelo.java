package util.veiculo;

public enum Modelo {
	ADVENTURE(1), NORMAL(2), OFFROAD(3), TRACKER(4);

	private final int modelo;

	Modelo(int modelo) {
		this.modelo = modelo;
	}

	public int getValue() {
		return this.modelo;
	}
}
