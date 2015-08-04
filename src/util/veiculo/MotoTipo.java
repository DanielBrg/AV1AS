package util.veiculo;

public enum MotoTipo {
	CHOPPER(1), CUSTOM(2), SCOOTERS(3), TRACKER(4);

	private final int tipo;

	private MotoTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getValue() {
		return this.tipo;
	}
}
