package com.GADS.av1as.entidades;

import java.util.ArrayList;
import java.util.Map.Entry;

public class Loja {
	String nome;
	String endereco;
	public ArrayList<Veiculo> estoque;
	
	public Loja() {

	}
	
	public Loja(String nome, String endereco, ArrayList<Veiculo> estoque) {
		this.nome = nome;
		this.endereco = endereco;
		this.estoque = estoque;
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

	public ArrayList<Veiculo> getEstoque() {
		return estoque;
	}

	public void setEstoque(ArrayList<Veiculo> estoque) {
		this.estoque = estoque;
	}
	
	public void exibeVeiculo(Veiculo veiculo) {
		System.out.println("\n>>> Veículo:");
		for(Entry<String, Object> par: veiculo.especificacao.entrySet()) {
			System.out.println(">> " + par.getKey() + " - " + par.getValue());
		}
	}
	
	public void listarEstoque() {
		System.out.println("\nListando o estoque da Loja...");
		for (Veiculo veiculo : this.estoque) {
			exibeVeiculo(veiculo);
		}
	}
	
	public void buscarChassi(String buscar) {
		System.out.println("\n>>> Resultado da busca:");
		for (Veiculo veiculo : this.estoque) {
			if(veiculo.especificacao.containsValue(buscar)) {
				System.out.println("\n>>> O veículo foi encontrado!");
				exibeVeiculo(veiculo);
				return;
			}
		}
		System.out.println("\n>>> O veículo não foi encontrado...\n");
	}
	
	public void pesquisarEstoque(Object pesquisar) {
		boolean encontrou = false;
		System.out.println("\n>>> Resultado da pesquisa:");
		for (Veiculo veiculo : this.estoque) {
			if(veiculo.especificacao.containsValue(pesquisar)) {
				exibeVeiculo(veiculo);
				encontrou = true;
			}
		}
		if(!encontrou) {
			System.out.println("\n>>> A pesquisa não encontrou veículos com estas características...\n");
		}
	}

}
