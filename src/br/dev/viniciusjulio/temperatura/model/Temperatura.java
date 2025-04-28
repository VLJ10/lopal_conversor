package br.dev.viniciusjulio.temperatura.model;

public class Temperatura {
	
	//criando a variavel celsius
	private double celsius;
	
	
	
	//criando os metodos get e set
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	
	
	//criando as operacoes de conversor
	public double converterParaKelvin() {
		double kelvin = 273.15 + celsius;
		return kelvin;
	}
	
	public double converterParaFahreinheit() {
		double fahreinheit = celsius * 1.8 + 32;
		return fahreinheit;
	}
}
