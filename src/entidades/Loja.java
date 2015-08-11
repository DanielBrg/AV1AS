package entidades;

import java.util.ArrayList;

public class Loja {
	String nome;
	String endereco;
	public ArrayList<Carro> estoqueCarros;
	public ArrayList<Motocicleta> estoqueMotos;
	
	public Loja() {

	}
	
	public Loja(String nome, String endereco, ArrayList<Carro> estoqueCarros, ArrayList<Motocicleta> estoqueMotos) {
		this.nome = nome;
		this.endereco = endereco;
		this.estoqueCarros = estoqueCarros;
		this.estoqueMotos = estoqueMotos;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Carro> getEstoqueCarros() {
		return estoqueCarros;
	}

	public void setEstoqueCarros(ArrayList<Carro> estoqueCarros) {
		this.estoqueCarros = estoqueCarros;
	}

	public ArrayList<Motocicleta> getEstoqueMotos() {
		return estoqueMotos;
	}

	public void setEstoqueMotos(ArrayList<Motocicleta> estoqueMotos) {
		this.estoqueMotos = estoqueMotos;
	}

	public void listarEstoquedeCarros() {
		System.out.println("\nLista do estoque de Carros:\n");
		for (Carro carro : this.estoqueCarros) {
			System.out.println(carro.getInformacoes());
		}
	}
	
	public void listarEstoquedeMotos() {
		System.out.println("\nLista do estoque de Motos:\n");
		for (Motocicleta moto : this.estoqueMotos) {
			System.out.println(moto.getInformacoes());
		}
	}
	
	public void buscarChassiCarro(String buscar) {
		for (Carro carro : this.estoqueCarros) {
			if(carro.getChassi().equals(buscar)) {
				System.out.println("\n>>> O carro foi encontrado:\n" + carro.getInformacoes() + "\n");
				return;
			}
		}
		System.out.println("\n>>> O carro não foi encontrado...\n");
	}
	
	public void buscarChassiMoto(String buscar) {
		for (Motocicleta moto : this.estoqueMotos) {
			if(moto.getChassi().equals(buscar)) {
				System.out.println("\n>>> A moto foi encontrada:\n" + moto.getInformacoes() + "\n");
				return;
			}
		}
		System.out.println("\n>>> A moto não foi encontrada...\n");
	}
}