package util.veiculo;

public enum Cambio {
	AUTOMATICO(1), MANUAL(2);

	private final int cambio;

	Cambio(int cambio) {
		this.cambio = cambio;
	}
	
	public int getValue() {
		return this.cambio;
	}
}