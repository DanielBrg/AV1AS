package entidades.abstratas;

import entidades.Carro;
import entidades.Motocicleta;

public abstract class VeiculoFactory {
	
	public static Veiculo criarVeiculo(String tipoVeiculo) {
		Veiculo returnObj;
		
		switch (tipoVeiculo) {
		case "Carro":
			returnObj = new Carro();
			break;
		case "Motocicleta":
			returnObj = new Motocicleta();
			break;
		default:
			returnObj = null;
			break;
		}
		
		return returnObj;
	}
}
