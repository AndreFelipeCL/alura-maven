package br.com.andre.maven;

import lombok.Data;

@Data
public class Produto {
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
}
