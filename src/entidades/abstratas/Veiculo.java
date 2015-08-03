package entidades.abstratas;

import util.veiculo.Cambio;
import util.veiculo.Cor;
import util.veiculo.Modelo;
import util.veiculo.Montadora;
import util.veiculo.Tipo;

public abstract class Veiculo {
	private String chassi;
	private Montadora montadora;
	private Modelo modelo;
	private Tipo tipo;
	private Cor cor;
	private Cambio cambio;
	private float preco;

	public Veiculo() {
	}

	public Veiculo(String chassi) {
		this.setChassi(chassi);
	}
	
	public Veiculo(String chassi, Montadora montadora, Modelo modelo, Tipo tipo, Cor cor,
			Cambio cambio, float preco) {
		this.setChassi(chassi).setMontadora(montadora).setModelo(modelo).setTipo(tipo).setCor(cor).setCambio(cambio)
				.setPreco(preco);
	}

	public String getChassi() {
		return chassi;
	}

	public Veiculo setChassi(String chassi) {
		this.chassi = chassi;
		return this;
	}

	public Montadora getMontadora() {
		return montadora;
	}

	public Veiculo setMontadora(Montadora montadora) {
		this.montadora = montadora;
		return this;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public Veiculo setModelo(Modelo modelo) {
		this.modelo = modelo;
		return this;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Veiculo setTipo(Tipo tipo) {
		this.tipo = tipo;
		return this;
	}

	public Cor getCor() {
		return cor;
	}

	public Veiculo setCor(Cor cor) {
		this.cor = cor;
		return this;
	}

	public Cambio getCambio() {
		return cambio;
	}

	public Veiculo setCambio(Cambio cambio) {
		this.cambio = cambio;
		return this;
	}

	public float getPreco() {
		return preco;
	}

	public Veiculo setPreco(float preco) {
		this.preco = preco;
		return this;
	}
}