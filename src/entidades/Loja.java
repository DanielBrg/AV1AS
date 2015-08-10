package entidades;

import java.util.ArrayList;

public class Loja {
	String nome;
	String endereco;
	public ArrayList<Carro> estoqueCarros;
	public ArrayList<Motocicleta> estoqueMotos;
	
	public Loja(String nome, String endereco, ArrayList<Carro> estoqueCarros, ArrayList<Motocicleta> estoqueMotos) {
		this.nome = nome;
		this.endereco = endereco;
		this.estoqueCarros = estoqueCarros;
		this.estoqueMotos = estoqueMotos;
	}
	
	public String getNomeLoja() {
		return this.nome;
	}
	
	public String getEndLoja() {
		return this.endereco;
	}
	
	public void listarEstoquedeCarros() {
		System.out.println("\nLista do estoque de Carros:\n");
		for (Carro carro : this.estoqueCarros) {
			System.out.println(carro.getDadosCarro());
		}
	}
	
	public void listarEstoquedeMotos() {
		System.out.println("\nLista do estoque de Motos:\n");
		for (Motocicleta moto : this.estoqueMotos) {
			System.out.println(moto.getDadosMoto());
		}
	}
	
	public void buscarChassiCarro(String buscar) {
		for (Carro carro : this.estoqueCarros) {
			if(carro.getChassi().equals(buscar)) {
				System.out.println("\n>>> O carro foi encontrado:\n" + carro.getDadosCarro() + "\n");
				return;
			}
		}
		System.out.println("\n>>> O carro não foi encontrado...\n");
	}
	
	public void buscarChassiMoto(String buscar) {
		for (Motocicleta moto : this.estoqueMotos) {
			if(moto.getChassi().equals(buscar)) {
				System.out.println("\n>>> A moto foi encontrada:\n" + moto.getDadosMoto() + "\n");
				return;
			}
		}
		System.out.println("\n>>> A moto não foi encontrada...\n");
	}
}