package entidades;

import entidades.abstratas.Veiculo;
import util.veiculo.Cambio;
import util.veiculo.Cor;
import util.veiculo.Modelo;
import util.veiculo.Montadora;
import util.veiculo.Tipo;

public class Carro extends Veiculo {
	public Carro() {
		super();
	}

	public Carro(String chassi) {
		super(chassi);
	}

	public Carro(String chassi, Montadora montadora, Modelo modelo, Tipo tipo, Cor cor,
			Cambio cambio, float preco) {
		super(chassi, montadora, modelo, tipo, cor, cambio, preco);
	}
}