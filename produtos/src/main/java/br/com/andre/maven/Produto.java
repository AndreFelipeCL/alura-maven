package br.com.andre.maven;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public double getPrecoComImposto() {
		return getPreco() * 1.10;
	}

}
