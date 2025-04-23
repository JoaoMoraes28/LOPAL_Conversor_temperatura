package br.dev.joao.temperatura.model;

public class Temperatura {
	
	private double celsius;
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converterParaKelvin() {
		celsius+=273.15;
		return celsius;
	}

	public double converterParaFahreinheit() {
		celsius = (celsius * 1.8) + 32;
		return celsius;
	}
	
	
	
}
