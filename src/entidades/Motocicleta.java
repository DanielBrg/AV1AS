package entidades;

import entidades.abstratas.Veiculo;
import util.veiculo.Cambio;
import util.veiculo.Cor;
import util.veiculo.Modelo;
import util.veiculo.Montadora;
import util.veiculo.Tipo;

public class Motocicleta extends Veiculo {
	private int cilidrada;
	private int capacidadeTanque;

	public Motocicleta() {
		super();
	}

	public Motocicleta(String chassi) {
		super(chassi);
	}

	public Motocicleta(String chassi, Montadora montadora, Modelo modelo, Tipo tipo,
			Cor cor, Cambio cambio, float preco, int cilindrada, int capacidadeTaque) {
		super(chassi, montadora, modelo, tipo, cor, cambio, preco);
		this.setCilidrada(cilindrada).setCapacidadeTanque(capacidadeTaque);
	}

	public int getCilidrada() {
		return cilidrada;
	}

	public Motocicleta setCilidrada(int cilidrada) {
		this.cilidrada = cilidrada;
		return this;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public Motocicleta setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
		return this;
	}
}