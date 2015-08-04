package util.veiculo;

public enum MotoMontadora {
	YAMAHA(1), HONDA(2), KAWASAKI(3), SUZUKI(4), DUCATI(5);

	private final int montadora;

	private MotoMontadora(int montadora) {
		this.montadora = montadora;
	}

	public int getValue() {
		return this.montadora;
	}
}
