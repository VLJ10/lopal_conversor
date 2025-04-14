package br.dev.viniciusjulio.temperatura.model;

public class Temperatura {
	
	
	private double celsius;
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converterParaKelvin() {
		double kelvin = 273.15 + celsius;
		return kelvin;
	}
	
	public double converterParaFahreinheit() {
		double fahreinheit = celsius * 1.8 + 32;
		return fahreinheit;
	}
}
