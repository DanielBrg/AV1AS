package entidades;

import entidades.abstratas.Veiculo;
import util.veiculo.Cor;
import util.veiculo.MotoMontadora;
import util.veiculo.MotoModelo;
import util.veiculo.MotoTipo;

public class Motocicleta extends Veiculo {
	private MotoMontadora montadora;
	private MotoModelo modelo;
	private MotoTipo tipo;
	private int cilidrada;
	private int capacidadeTanque;


	public Motocicleta(String chassi, MotoMontadora montadora, MotoModelo modelo, MotoTipo tipo,
			Cor cor, int cilindrada, int capacidadeTaque, float preco) {
		super(chassi, cor, preco);
		this.montadora = montadora;
		this.modelo = modelo;
		this.tipo = tipo;
		this.cilidrada = cilindrada;
		this.capacidadeTanque = capacidadeTaque;
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
	
	public String getDadosMoto() {
		return super.getChassi() + " - " + this.montadora + " - " + this.modelo + " - " + this.tipo + " - "
			+ super.getCor() + " - " + this.cilidrada + " - " + this.capacidadeTanque + " - " + super.getPreco();
	}
}