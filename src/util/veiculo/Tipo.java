package util.veiculo;

public enum Tipo {
	SEDAN(1), COUPE(2), HATCH(3), SUV(4);

	private final int tipo;

	private Tipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getValue() {
		return this.tipo;
	}
}
