package util.veiculo;

public enum CarroModelo {
	ADVENTURE(1), NORMAL(2), OFFROAD(3), TRACKER(4);

	private final int modelo;

	CarroModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getValue() {
		return this.modelo;
	}
}
