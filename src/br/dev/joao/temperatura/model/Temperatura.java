package br.dev.joao.temperatura.model;

public class Temperatura {
	
	private double celsius;
	
	//Metodos getters e setters
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	//Funcao que ira converter celsius para kelvin
	public double converterParaKelvin() {
		celsius+=273.15;
		return celsius;
	}

	//Funcao que ira converter celsius para fahreinheit
	public double converterParaFahreinheit() {
		celsius = (celsius * 1.8) + 32;
		return celsius;
	}
	
	
	
}
