package app;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.*;
import util.veiculo.*;
import entidades.abstratas.*;

public class Main {
	public static void main(String[] args) {
		
		Carro carro1 = (Carro) VeiculoFactory.criarVeiculo("Carro");
		Carro carro2 = (Carro) VeiculoFactory.criarVeiculo("Carro");
		Carro carro3 = (Carro) VeiculoFactory.criarVeiculo("Carro");
		Carro carro4 = (Carro) VeiculoFactory.criarVeiculo("Carro");
		Carro carro5 = (Carro) VeiculoFactory.criarVeiculo("Carro");
		
		carro1.setChassi("00001");
		carro1.setMontadora(CarroMontadora.CHEVROLET);
		carro1.setModelo(CarroModelo.ADVENTURE);
		carro1.setTipo(CarroTipo.COUPE);
		carro1.setCor(Cor.AMARELO);
		carro1.setMotorizacao(2.0f);
		carro1.setCambio(CarroCambio.AUTOMATICO);
		carro1.setPreco(10000);
		
		carro2.setChassi("00002");
		carro2.setMontadora(CarroMontadora.FIAT);
		carro2.setModelo(CarroModelo.NORMAL);
		carro2.setTipo(CarroTipo.HATCH);
		carro2.setCor(Cor.BRANCO);
		carro2.setMotorizacao(2.2f);
		carro2.setCambio(CarroCambio.MANUAL);
		carro2.setPreco(20000);
		
		carro3.setChassi("00003");
		carro3.setMontadora(CarroMontadora.FORD);
		carro3.setModelo(CarroModelo.OFFROAD);
		carro3.setTipo(CarroTipo.SEDAN);
		carro3.setCor(Cor.PRATA);
		carro3.setMotorizacao(1.0f);
		carro3.setCambio(CarroCambio.AUTOMATICO);
		carro3.setPreco(30000);
		
		carro4.setChassi("00004");
		carro4.setMontadora(CarroMontadora.VOLKSWAGEN);
		carro4.setModelo(CarroModelo.TRACKER);
		carro4.setTipo(CarroTipo.SUV);
		carro4.setCor(Cor.PRETO);
		carro4.setMotorizacao(3.6f);
		carro4.setCambio(CarroCambio.MANUAL);
		carro4.setPreco(40000);
		
		carro5.setChassi("00005");
		carro5.setMontadora(CarroMontadora.CHEVROLET);
		carro5.setModelo(CarroModelo.ADVENTURE);
		carro5.setTipo(CarroTipo.COUPE);
		carro5.setCor(Cor.VERDE);
		carro5.setMotorizacao(2.0f);
		carro5.setCambio(CarroCambio.AUTOMATICO);
		carro5.setPreco(50000);
		
		ArrayList<Carro> estoqueCarros = new ArrayList<Carro>(); //Lista o estoque de Carros atual
		estoqueCarros.add(carro1);
		estoqueCarros.add(carro2);
		estoqueCarros.add(carro3);
		estoqueCarros.add(carro4);
		estoqueCarros.add(carro5);

		Motocicleta moto1 = (Motocicleta) VeiculoFactory.criarVeiculo("Motocicleta");
		Motocicleta moto2 = (Motocicleta) VeiculoFactory.criarVeiculo("Motocicleta");
		Motocicleta moto3 = (Motocicleta) VeiculoFactory.criarVeiculo("Motocicleta");
		Motocicleta moto4 = (Motocicleta) VeiculoFactory.criarVeiculo("Motocicleta");
		Motocicleta moto5 = (Motocicleta) VeiculoFactory.criarVeiculo("Motocicleta");
		
		moto1.setChassi("00001");
		moto1.setMontadora(MotoMontadora.DUCATI);
		moto1.setModelo(MotoModelo.ESPORTIVA);
		moto1.setTipo(MotoTipo.CUSTOM);
		moto1.setCor(Cor.BRANCO);
		moto1.setCilindrada(1200);
		moto1.setCapacidadeTanque(15);
		moto1.setPreco(15000);

		moto2.setChassi("00002");
		moto2.setMontadora(MotoMontadora.HONDA);
		moto2.setModelo(MotoModelo.ESTRADEIRA);
		moto2.setTipo(MotoTipo.CUSTOM);
		moto2.setCor(Cor.VERMELHO);
		moto2.setCilindrada(600);
		moto2.setCapacidadeTanque(20);
		moto2.setPreco(25000);

		moto3.setChassi("00003");
		moto3.setMontadora(MotoMontadora.KAWASAKI);
		moto3.setModelo(MotoModelo.NORMAL);
		moto3.setTipo(MotoTipo.SCOOTERS);
		moto3.setCor(Cor.PRETO);
		moto3.setCilindrada(100);
		moto3.setCapacidadeTanque(10);
		moto3.setPreco(35000);

		moto4.setChassi("00004");
		moto4.setMontadora(MotoMontadora.SUZUKI);
		moto4.setModelo(MotoModelo.OFFROAD);
		moto4.setTipo(MotoTipo.CHOPPER);
		moto4.setCor(Cor.AMARELO);
		moto4.setCilindrada(350);
		moto4.setCapacidadeTanque(18);
		moto4.setPreco(45000);
		
		moto5.setChassi("00005");
		moto5.setMontadora(MotoMontadora.YAMAHA);
		moto5.setModelo(MotoModelo.ESPORTIVA);
		moto5.setTipo(MotoTipo.TRACKER);
		moto5.setCor(Cor.VERDE);
		moto5.setCilindrada(1000);
		moto5.setCapacidadeTanque(15);
		moto5.setPreco(55000);
		
		ArrayList<Motocicleta> estoqueMotos = new ArrayList<Motocicleta>(); //Lista o estoque de motos atual
		estoqueMotos.add(moto1);
		estoqueMotos.add(moto2);
		estoqueMotos.add(moto3);
		estoqueMotos.add(moto4);
		estoqueMotos.add(moto5);
		
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
