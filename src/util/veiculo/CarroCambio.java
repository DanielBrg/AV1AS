package util.veiculo;

public enum CarroCambio {
	AUTOMATICO(1), MANUAL(2);

	private final int cambio;

	CarroCambio(int cambio) {
		this.cambio = cambio;
	}
	
	public int getValue() {
		return this.cambio;
	}
}