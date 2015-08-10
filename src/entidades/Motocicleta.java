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
	
	public Motocicleta () {
		
	}

	public Motocicleta(String chassi, MotoMontadora montadora, MotoModelo modelo, MotoTipo tipo,
			Cor cor, int cilindrada, int capacidadeTaque, float preco) {
		super(chassi, cor, preco);
		this.montadora = montadora;
		this.modelo = modelo;
		this.tipo = tipo;
		this.cilidrada = cilindrada;
		this.capacidadeTanque = capacidadeTaque;
	}
	
	public MotoMontadora getMontadora() {
		return montadora;
	}

	public void setMontadora(MotoMontadora montadora) {
		this.montadora = montadora;
	}

	public MotoModelo getModelo() {
		return modelo;
	}

	public void setModelo(MotoModelo modelo) {
		this.modelo = modelo;
	}

	public MotoTipo getTipo() {
		return tipo;
	}

	public void setTipo(MotoTipo tipo) {
		this.tipo = tipo;
	}

	public int getCilidrada() {
		return cilidrada;
	}

	public void setCilidrada(int cilidrada) {
		this.cilidrada = cilidrada;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public String getDadosMoto() {
		return super.getChassi() + " - " + this.montadora + " - " + this.modelo + " - " + this.tipo + " - "
			+ super.getCor() + " - " + this.cilidrada + " - " + this.capacidadeTanque + " - " + super.getPreco();
	}
}