package com.afbh.demo.clases.service;

public class Gato {

	private String nombre;
	private int cantidad;
	private double altura;

	public void setNombre ( String parametroNombre) {
		this.nombre = parametroNombre;
		
	}

	public String getNombre () {
		return this.nombre; 
	}
	
	public void setCantidad (int parametroCantidad) {
		this.cantidad = parametroCantidad;
	}
	public int getCantidad () {
		return this.cantidad;
	}
	public void setAltura ( double parametroAltura) {
		this.altura = parametroAltura;
		
	}
	public double getAltura() {
		return this.altura = parametroAltura;
		
	}
}
