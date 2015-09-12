package com.GADS.av1as.entidades;

import java.util.ArrayList;
import java.util.Scanner;

import com.GADS.av1as.enumeracoes.CarroCambio;
import com.GADS.av1as.enumeracoes.CarroModelo;
import com.GADS.av1as.enumeracoes.CarroMontadora;
import com.GADS.av1as.enumeracoes.CarroTipo;
import com.GADS.av1as.enumeracoes.Cor;
import com.GADS.av1as.enumeracoes.MotoModelo;
import com.GADS.av1as.enumeracoes.MotoMontadora;
import com.GADS.av1as.enumeracoes.MotoTipo;
import com.GADS.av1as.enumeracoes.TipoVeiculo;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo c1 = new Veiculo();
		c1.especificacao.put("tipoVeiculo",TipoVeiculo.CARRO);
		c1.especificacao.put("chassi","00001");
		c1.especificacao.put("montadora",CarroMontadora.CHEVROLET);
		c1.especificacao.put("modelo",CarroModelo.ADVENTURE);
		c1.especificacao.put("tipo",CarroTipo.COUPE);
		c1.especificacao.put("cor",Cor.AMARELO);
		c1.especificacao.put("motorizacao",2.0f);
		c1.especificacao.put("cambio",CarroCambio.AUTOMATICO);
		c1.especificacao.put("valor",10000);
		
		Veiculo c2 = new Veiculo();
		c2.especificacao.put("tipoVeiculo",TipoVeiculo.CARRO);
		c2.especificacao.put("chassi","00002");
		c2.especificacao.put("montadora",CarroMontadora.FIAT);
		c2.especificacao.put("modelo",CarroModelo.NORMAL);
		c2.especificacao.put("tipo",CarroTipo.HATCH);
		c2.especificacao.put("cor",Cor.BRANCO);
		c2.especificacao.put("motorizacao",2.2f);
		c2.especificacao.put("cambio",CarroCambio.MANUAL);
		c2.especificacao.put("valor",20000);

		Veiculo c3 = new Veiculo();
		c3.especificacao.put("tipoVeiculo",TipoVeiculo.CARRO);
		c3.especificacao.put("chassi","00003");
		c3.especificacao.put("montadora",CarroMontadora.FORD);
		c3.especificacao.put("modelo",CarroModelo.OFFROAD);
		c3.especificacao.put("tipo",CarroTipo.SEDAN);
		c3.especificacao.put("cor",Cor.PRATA);
		c3.especificacao.put("motorizacao",1.0f);
		c3.especificacao.put("cambio",CarroCambio.AUTOMATICO);
		c3.especificacao.put("valor",30000);

		Veiculo c4 = new Veiculo();
		c4.especificacao.put("tipoVeiculo",TipoVeiculo.CARRO);
		c4.especificacao.put("chassi","00004");
		c4.especificacao.put("montadora",CarroMontadora.VOLKSWAGEN);
		c4.especificacao.put("modelo",CarroModelo.TRACKER);
		c4.especificacao.put("tipo",CarroTipo.SUV);
		c4.especificacao.put("cor",Cor.PRETO);
		c4.especificacao.put("motorizacao",3.6f);
		c4.especificacao.put("cambio",CarroCambio.MANUAL);
		c4.especificacao.put("valor",40000);

		Veiculo c5 = new Veiculo();
		c5.especificacao.put("tipoVeiculo",TipoVeiculo.CARRO);
		c5.especificacao.put("chassi","00005");
		c5.especificacao.put("montadora",CarroMontadora.CHEVROLET);
		c5.especificacao.put("modelo",CarroModelo.ADVENTURE);
		c5.especificacao.put("tipo",CarroTipo.COUPE);
		c5.especificacao.put("cor",Cor.VERDE);
		c5.especificacao.put("motorizacao",2.0f);
		c5.especificacao.put("cambio",CarroCambio.AUTOMATICO);
		c5.especificacao.put("valor",50000);

		Veiculo m1 = new Veiculo();
		m1.especificacao.put("tipoVeiculo",TipoVeiculo.MOTO);
		m1.especificacao.put("chassi","00010");
		m1.especificacao.put("montadora",MotoMontadora.DUCATI);
		m1.especificacao.put("modelo",MotoModelo.ESPORTIVA);
		m1.especificacao.put("tipo",MotoTipo.CUSTOM);
		m1.especificacao.put("cor",Cor.BRANCO);
		m1.especificacao.put("cilindrada",1200);
		m1.especificacao.put("capacidadeTanque",15);
		m1.especificacao.put("valor",15000);

		Veiculo m2 = new Veiculo();
		m2.especificacao.put("tipoVeiculo",TipoVeiculo.MOTO);
		m2.especificacao.put("chassi","00020");
		m2.especificacao.put("montadora",MotoMontadora.HONDA);
		m2.especificacao.put("modelo",MotoModelo.ESTRADEIRA);
		m2.especificacao.put("tipo",MotoTipo.CUSTOM);
		m2.especificacao.put("cor",Cor.VERMELHO);
		m2.especificacao.put("cilindrada",600);
		m2.especificacao.put("capacidadeTanque",20);
		m2.especificacao.put("valor",25000);

		Veiculo m3 = new Veiculo();
		m3.especificacao.put("tipoVeiculo",TipoVeiculo.MOTO);
		m3.especificacao.put("chassi","00030");
		m3.especificacao.put("montadora",MotoMontadora.KAWASAKI);
		m3.especificacao.put("modelo",MotoModelo.NORMAL);
		m3.especificacao.put("tipo",MotoTipo.SCOOTERS);
		m3.especificacao.put("cor",Cor.PRETO);
		m3.especificacao.put("cilindrada",100);
		m3.especificacao.put("capacidadeTanque",10);
		m3.especificacao.put("valor",35000);

		Veiculo m4 = new Veiculo();
		m4.especificacao.put("tipoVeiculo",TipoVeiculo.MOTO);
		m4.especificacao.put("chassi","00040");
		m4.especificacao.put("montadora",MotoMontadora.SUZUKI);
		m4.especificacao.put("modelo",MotoModelo.OFFROAD);
		m4.especificacao.put("tipo",MotoTipo.CHOPPER);
		m4.especificacao.put("cor",Cor.AMARELO);
		m4.especificacao.put("cilindrada",350);
		m4.especificacao.put("capacidadeTanque",18);
		m4.especificacao.put("valor",45000);

		Veiculo m5 = new Veiculo();
		m5.especificacao.put("tipoVeiculo",TipoVeiculo.MOTO);
		m5.especificacao.put("chassi","00005");
		m5.especificacao.put("montadora",MotoMontadora.YAMAHA);
		m5.especificacao.put("modelo",MotoModelo.ESPORTIVA);
		m5.especificacao.put("tipo",MotoTipo.TRACKER);
		m5.especificacao.put("cor",Cor.VERDE);
		m5.especificacao.put("cilindrada",1000);
		m5.especificacao.put("capacidadeTanque",15);
		m5.especificacao.put("valor",55000);
		
		ArrayList<Veiculo> estoque = new ArrayList<Veiculo>();
		estoque.add(c1);
		estoque.add(c2);
		estoque.add(c3);
		estoque.add(c4);
		estoque.add(c5);
		estoque.add(m1);
		estoque.add(m2);
		estoque.add(m3);
		estoque.add(m4);
		estoque.add(m5);
		
		Loja loja = new Loja("Lojinha de Veículos","Rua dos Veículos, 1000", estoque);
		//loja.listarEstoque();
		//loja.buscarChassi("00002");
		//loja.pesquisarEstoque(Cor.AMARELO);
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while(true) {	
			System.out.println("\nBem-vindo à " + loja.getNome() + " [" + loja.getEndereco() + "]\n");
			System.out.println("Menu:\n");
			System.out.println("[1] - Listar estoque de veículos.");
			System.out.println("[2] - Buscar veículo pelo chassi.");
			System.out.println("[3] - Pesquisar veículos. (veículos de cor amarela)");
			System.out.println("[0] - Sair.");
			System.out.print("\nEscolha a sua opção: ");
	        String opt = scanner.next();
	        switch (opt) {
	            case "0":
	            	System.out.println("\n>>> Saindo...\n");
	            	return;
	            case "1":
	            	loja.listarEstoque();
	            	break;
	            case "2":
	            	System.out.print("\nDigite o chassi do veículo: ");
	            	String codChassi = scanner.next();
	            	loja.buscarChassi(codChassi);
	            	break;
	            case "3":
	            	System.out.print("\nDigite o parâmetro de pesquisa: ");
	            	//String paramPesquisa = scanner.next();
	            	// O parâmetro de busca pode ser qualquer de qualquer tipo que se encontra no HashMap.
	            	loja.pesquisarEstoque(Cor.AMARELO);
	            	break;
	            default: System.out.println("\n>>> Esta opção não existe... tente novamente.\n");
	        }	
		}
	}
}

