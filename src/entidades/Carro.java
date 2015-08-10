package entidades;

import entidades.abstratas.Veiculo;

import util.veiculo.Cor;
import util.veiculo.CarroModelo;
import util.veiculo.CarroMontadora;
import util.veiculo.CarroTipo;
import util.veiculo.CarroCambio;

public class Carro extends Veiculo {
	
	private CarroMontadora montadora;
	private CarroModelo modelo;
	private CarroTipo tipo;
	private float motorizacao;
	private CarroCambio cambio;
	
	public Carro() {
		
	}
	
	public Carro(String chassi, CarroMontadora montadora, CarroModelo modelo, CarroTipo tipo, Cor cor,
			float motorizacao, CarroCambio cambio, float preco) {
		super(chassi, cor, preco);
		this.montadora = montadora;
		this.modelo = modelo;
		this.tipo = tipo;
		this.motorizacao = motorizacao;
		this.cambio = cambio;
	}
	
	public CarroMontadora getMontadora() {
		return montadora;
	}

	public void setMontadora(CarroMontadora montadora) {
		this.montadora = montadora;
	}

	public CarroModelo getModelo() {
		return modelo;
	}

	public void setModelo(CarroModelo modelo) {
		this.modelo = modelo;
	}

	public CarroTipo getTipo() {
		return tipo;
	}

	public void setTipo(CarroTipo tipo) {
		this.tipo = tipo;
	}

	public float getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}

	public CarroCambio getCambio() {
		return cambio;
	}

	public void setCambio(CarroCambio cambio) {
		this.cambio = cambio;
	}

	public String getDadosCarro() {
		return super.getChassi() + " - " + this.montadora + " - " + this.modelo + " - " + this.tipo + " - "
			+ super.getCor() + " - " + this.motorizacao + " - " + this.cambio + " - " + super.getPreco();
	}
}