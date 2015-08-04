package util.veiculo;

public enum CarroTipo {
	SEDAN(1), COUPE(2), HATCH(3), SUV(4);

	private final int tipo;

	private CarroTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getValue() {
		return this.tipo;
	}
}
