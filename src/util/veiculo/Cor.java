package util.veiculo;

public enum Cor {
	AMARELO(1), BRANCO(2), PRATA(3), PRETO(4), VERDE(5), VERMELHO(6);

	private final int cor;

	Cor(int cor) {
		this.cor = cor;
	}
	
	public int getValue() {
		return this.cor;
	}
}