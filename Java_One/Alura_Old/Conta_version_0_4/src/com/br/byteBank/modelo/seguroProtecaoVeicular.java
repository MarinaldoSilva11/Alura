package com.br.byteBank.modelo;

public class seguroProtecaoVeicular implements Tributavel{
	
	private double valorDoSeguro, impostoDoSeguro;
	
	public double getValorDoSeguro() {
		return valorDoSeguro;
	}

	public void setValorDoSeguro(double valor) {
		this.valorDoSeguro = valor;
	}

	public double getImpostoDoSeguro() {
		return impostoDoSeguro;
	}

	public void setImpostoDoSeguro(double valor) {
		this.impostoDoSeguro = valor;
	}

	@Override
	public double getValorImposto() {
		return valorDoSeguro * 0.09;
	}
	
	
}
