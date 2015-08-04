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
	
	public String getDadosCarro() {
		return super.getChassi() + " - " + this.montadora + " - " + this.modelo + " - " + this.tipo + " - "
			+ super.getCor() + " - " + this.motorizacao + " - " + this.cambio + " - " + super.getPreco();
	}
}