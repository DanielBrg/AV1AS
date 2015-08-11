package entidades.abstratas;

import util.veiculo.Cor;

public abstract class Veiculo {
	private String chassi;
	private Cor cor;
	private float preco;

	public Veiculo() {
	
	}

	public Veiculo(String chassi, Cor cor, float preco) {
		this.setChassi(chassi).setCor(cor).setPreco(preco);
	}

	public String getChassi() {
		return chassi;
	}

	public Veiculo setChassi(String chassi) {
		this.chassi = chassi;
		return this;
	}

	public Cor getCor() {
		return cor;
	}

	public Veiculo setCor(Cor cor) {
		this.cor = cor;
		return this;
	}

	public float getPreco() {
		return preco;
	}

	public Veiculo setPreco(float preco) {
		this.preco = preco;
		return this;
	}
	
	public abstract String getInformacoes();
}