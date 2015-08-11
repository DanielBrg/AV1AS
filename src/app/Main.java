package app;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.*;
import util.veiculo.*;
import entidades.abstratas.*;

public class Main {
	public static void main(String[] args) {
		
		Veiculo carro1 = VeiculoFactory.criarVeiculo("Carro");
		Veiculo carro2 = VeiculoFactory.criarVeiculo("Carro");
		Veiculo carro3 = VeiculoFactory.criarVeiculo("Carro");
		Veiculo carro4 = VeiculoFactory.criarVeiculo("Carro");
		Veiculo carro5 = VeiculoFactory.criarVeiculo("Carro");
		
		((Carro)carro1).setChassi("00001");
		((Carro)carro1).setMontadora(CarroMontadora.CHEVROLET);
		((Carro)carro1).setModelo(CarroModelo.ADVENTURE);
		((Carro)carro1).setTipo(CarroTipo.COUPE);
		((Carro)carro1).setCor(Cor.AMARELO);
		((Carro)carro1).setMotorizacao(2.0f);
		((Carro)carro1).setCambio(CarroCambio.AUTOMATICO);
		((Carro)carro1).setPreco(10000);
		
		((Carro)carro2).setChassi("00002");
		((Carro)carro2).setMontadora(CarroMontadora.FIAT);
		((Carro)carro2).setModelo(CarroModelo.NORMAL);
		((Carro)carro2).setTipo(CarroTipo.HATCH);
		((Carro)carro2).setCor(Cor.BRANCO);
		((Carro)carro2).setMotorizacao(2.2f);
		((Carro)carro2).setCambio(CarroCambio.MANUAL);
		((Carro)carro2).setPreco(20000);
		
		((Carro)carro3).setChassi("00003");
		((Carro)carro3).setMontadora(CarroMontadora.FORD);
		((Carro)carro3).setModelo(CarroModelo.OFFROAD);
		((Carro)carro3).setTipo(CarroTipo.SEDAN);
		((Carro)carro3).setCor(Cor.PRATA);
		((Carro)carro3).setMotorizacao(1.0f);
		((Carro)carro3).setCambio(CarroCambio.AUTOMATICO);
		((Carro)carro3).setPreco(30000);
		
		((Carro)carro4).setChassi("00004");
		((Carro)carro4).setMontadora(CarroMontadora.VOLKSWAGEN);
		((Carro)carro4).setModelo(CarroModelo.TRACKER);
		((Carro)carro4).setTipo(CarroTipo.SUV);
		((Carro)carro4).setCor(Cor.PRETO);
		((Carro)carro4).setMotorizacao(3.6f);
		((Carro)carro4).setCambio(CarroCambio.MANUAL);
		((Carro)carro4).setPreco(40000);
		
		((Carro)carro5).setChassi("00005");
		((Carro)carro5).setMontadora(CarroMontadora.CHEVROLET);
		((Carro)carro5).setModelo(CarroModelo.ADVENTURE);
		((Carro)carro5).setTipo(CarroTipo.COUPE);
		((Carro)carro5).setCor(Cor.VERDE);
		((Carro)carro5).setMotorizacao(2.0f);
		((Carro)carro5).setCambio(CarroCambio.AUTOMATICO);
		((Carro)carro5).setPreco(50000);
		
		ArrayList<Carro> estoqueCarros = new ArrayList<Carro>(); //Lista o estoque de Carros atual
		estoqueCarros.add((Carro)carro1);
		estoqueCarros.add((Carro)carro2);
		estoqueCarros.add((Carro)carro3);
		estoqueCarros.add((Carro)carro4);
		estoqueCarros.add((Carro)carro5);

		Veiculo moto1 = VeiculoFactory.criarVeiculo("Motocicleta");
		Veiculo moto2 = VeiculoFactory.criarVeiculo("Motocicleta");
		Veiculo moto3 = VeiculoFactory.criarVeiculo("Motocicleta");
		Veiculo moto4 = VeiculoFactory.criarVeiculo("Motocicleta");
		Veiculo moto5 = VeiculoFactory.criarVeiculo("Motocicleta");
		
		((Motocicleta) moto1).setChassi("00001");
		((Motocicleta) moto1).setMontadora(MotoMontadora.DUCATI);
		((Motocicleta) moto1).setModelo(MotoModelo.ESPORTIVA);
		((Motocicleta) moto1).setTipo(MotoTipo.CUSTOM);
		((Motocicleta) moto1).setCor(Cor.BRANCO);
		((Motocicleta) moto1).setCilindrada(1200);
		((Motocicleta) moto1).setCapacidadeTanque(15);
		((Motocicleta) moto1).setPreco(15000);

		((Motocicleta) moto2).setChassi("00002");
		((Motocicleta) moto2).setMontadora(MotoMontadora.HONDA);
		((Motocicleta) moto2).setModelo(MotoModelo.ESTRADEIRA);
		((Motocicleta) moto2).setTipo(MotoTipo.CUSTOM);
		((Motocicleta) moto2).setCor(Cor.VERMELHO);
		((Motocicleta) moto2).setCilindrada(600);
		((Motocicleta) moto2).setCapacidadeTanque(20);
		((Motocicleta) moto2).setPreco(25000);

		((Motocicleta) moto3).setChassi("00003");
		((Motocicleta) moto3).setMontadora(MotoMontadora.KAWASAKI);
		((Motocicleta) moto3).setModelo(MotoModelo.NORMAL);
		((Motocicleta) moto3).setTipo(MotoTipo.SCOOTERS);
		((Motocicleta) moto3).setCor(Cor.PRETO);
		((Motocicleta) moto3).setCilindrada(100);
		((Motocicleta) moto3).setCapacidadeTanque(10);
		((Motocicleta) moto3).setPreco(35000);

		((Motocicleta) moto4).setChassi("00004");
		((Motocicleta) moto4).setMontadora(MotoMontadora.SUZUKI);
		((Motocicleta) moto4).setModelo(MotoModelo.OFFROAD);
		((Motocicleta) moto4).setTipo(MotoTipo.CHOPPER);
		((Motocicleta) moto4).setCor(Cor.AMARELO);
		((Motocicleta) moto4).setCilindrada(350);
		((Motocicleta) moto4).setCapacidadeTanque(18);
		((Motocicleta) moto4).setPreco(45000);
		
		((Motocicleta) moto5).setChassi("00005");
		((Motocicleta) moto5).setMontadora(MotoMontadora.YAMAHA);
		((Motocicleta) moto5).setModelo(MotoModelo.ESPORTIVA);
		((Motocicleta) moto5).setTipo(MotoTipo.TRACKER);
		((Motocicleta) moto5).setCor(Cor.VERDE);
		((Motocicleta) moto5).setCilindrada(1000);
		((Motocicleta) moto5).setCapacidadeTanque(15);
		((Motocicleta) moto5).setPreco(55000);
		
		ArrayList<Motocicleta> estoqueMotos = new ArrayList<Motocicleta>(); //Lista o estoque de motos atual
		estoqueMotos.add((Motocicleta)moto1);
		estoqueMotos.add((Motocicleta)moto2);
		estoqueMotos.add((Motocicleta)moto3);
		estoqueMotos.add((Motocicleta)moto4);
		estoqueMotos.add((Motocicleta)moto5);
		
		Loja loja = new Loja("Lojinha de Veículos","Rua dos Veículos, 1000", estoqueCarros, estoqueMotos);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {	
			System.out.println("\nBem-vindo à " + loja.getNome() + " [" + loja.getEndereco() + "]\n");
			System.out.println("Menu:\n\n 1 - Listar estoque de Carros\n 2 - Listar estoque de Motos\n 3 - Buscar Carro pelo chassi \n 4 - Buscar Moto pelo chassi \n 0 - Sair");
			System.out.print("\nEscolha a sua opção: ");
	        String opt = scanner.next();
	        switch (opt) {
	            case "0":
	            	System.out.println("\n>>> Saindo...\n");
	            	return;
	            case "1":
	            	loja.listarEstoquedeCarros();
	            	break;
	            case "2":
	            	loja.listarEstoquedeMotos();
	            	break;
	            case "3":
	            	System.out.print("\nDigite o chassi do Carro: ");
	            	String buscarCarro = scanner.next();
	            	loja.buscarChassiCarro(buscarCarro);
	            	break;
	            case "4":
	            	System.out.print("\nDigite o chassi da Moto: ");
	            	String buscarMoto = scanner.next();
	            	loja.buscarChassiMoto(buscarMoto);
	            	break;
	            default: System.out.println("\n>>> Esta opção não existe... tente novamente.\n");
	        }	
		}
	}
}
