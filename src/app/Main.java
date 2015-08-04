package app;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.*;
import util.veiculo.*;

public class Main {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("00001", CarroMontadora.CHEVROLET, CarroModelo.ADVENTURE, CarroTipo.COUPE, Cor.AMARELO,2.0f, CarroCambio.AUTOMATICO, 10000);
		Carro carro2 = new Carro("00001", CarroMontadora.FIAT, CarroModelo.NORMAL, CarroTipo.HATCH, Cor.BRANCO,2.2f, CarroCambio.MANUAL, 20000);
		Carro carro3 = new Carro("00003", CarroMontadora.FORD, CarroModelo.OFFROAD, CarroTipo.SEDAN, Cor.PRATA,1.0f, CarroCambio.AUTOMATICO, 30000);
		Carro carro4 = new Carro("00004", CarroMontadora.VOLKSWAGEN, CarroModelo.TRACKER, CarroTipo.SUV, Cor.PRETO,3.6f, CarroCambio.MANUAL, 40000);
		Carro carro5 = new Carro("00005", CarroMontadora.CHEVROLET, CarroModelo.ADVENTURE, CarroTipo.COUPE, Cor.VERDE,2.0f, CarroCambio.AUTOMATICO, 50000);
		
		ArrayList<Carro> estoqueCarros = new ArrayList<Carro>();
		estoqueCarros.add(carro1);
		estoqueCarros.add(carro2);
		estoqueCarros.add(carro3);
		estoqueCarros.add(carro4);
		estoqueCarros.add(carro5);

		Motocicleta moto1 = new Motocicleta("00001", MotoMontadora.DUCATI, MotoModelo.ESPORTIVA, MotoTipo.CUSTOM, Cor.BRANCO,1200, 15, 15000);
		Motocicleta moto2 = new Motocicleta("00002", MotoMontadora.HONDA, MotoModelo.ESTRADEIRA, MotoTipo.CUSTOM, Cor.VERMELHO,600, 20, 25000);
		Motocicleta moto3 = new Motocicleta("00003", MotoMontadora.KAWASAKI, MotoModelo.NORMAL, MotoTipo.SCOOTERS, Cor.PRETO,100, 10, 35000);
		Motocicleta moto4 = new Motocicleta("00004", MotoMontadora.SUZUKI, MotoModelo.OFFROAD, MotoTipo.CHOPPER, Cor.AMARELO,350, 18, 45000);
		Motocicleta moto5 = new Motocicleta("00005", MotoMontadora.YAMAHA, MotoModelo.ESPORTIVA, MotoTipo.TRACKER, Cor.VERDE,1000, 15, 55000);
		
		ArrayList<Motocicleta> estoqueMotos = new ArrayList<Motocicleta>();
		estoqueMotos.add(moto1);
		estoqueMotos.add(moto2);
		estoqueMotos.add(moto3);
		estoqueMotos.add(moto4);
		estoqueMotos.add(moto5);
		
		Loja loja1 = new Loja("Lojinha de Veículos","Rua dos Veículos, 1000", estoqueCarros, estoqueMotos);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {	
			System.out.println("\nBem-vindo à " + loja1.getNomeLoja() + " [" + loja1.getEndLoja() + "]\n");
			System.out.println("Menu:\n\n 1 - Listar estoque de Carros\n 2 - Listar estoque de Motos\n 3 - Buscar Carro pelo chassi \n 4 - Buscar Moto pelo chassi \n 0 - Sair");
			System.out.print("\nEscolha a sua opção: ");
	        String opt = scanner.next();
	        switch (opt) {
	            case "0":
	            	System.out.println("\n>>> Saindo...\n");
	            	return;
	            case "1":
	            	loja1.listarEstoquedeCarros();
	            	break;
	            case "2":
	            	loja1.listarEstoquedeMotos();
	            	break;
	            case "3":
	            	System.out.print("\nDigite o chassi do Carro: ");
	            	String buscarCarro = scanner.next();
	            	loja1.buscarChassiCarro(buscarCarro);
	            	break;
	            case "4":
	            	System.out.print("\nDigite o chassi da Moto: ");
	            	String buscarMoto = scanner.next();
	            	loja1.buscarChassiMoto(buscarMoto);
	            	break;
	            default: System.out.println("\n>>> Esta opção não existe... tente novamente.\n");
	        }	
		}
	}
}
