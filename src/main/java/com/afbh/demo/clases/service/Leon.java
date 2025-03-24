package com.afbh.demo.clases.service;

public class Leon {

	private String raza;
	private int esperanzaVida;
	private double cazaSemana;
	
	public void setRaza(String parametroRaza) {
		this.raza = parametroRaza;
		
		
	}
	
	public String getRaza() {
		return this.raza;
		
	}
	public void setEsperanzaVida(int parametroEsperanzaVida) {
		this.esperanzaVida = parametroEsperanzaVida;
	}
	public int getEsperanzaVida() {
		return this.esperanzaVida;
	}
	
	public void setCazaSemana(double parametroCazaSemana) {
		this.cazaSemana = parametroCazaSemana;
		
	}
	public double getCazaSemana( ) {
		return this.cazaSemana;
	}
	
}

