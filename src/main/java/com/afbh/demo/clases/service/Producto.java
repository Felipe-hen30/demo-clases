package com.afbh.demo.clases.service;

public class Producto {
	private String nombre;
	private int costo;
	private double numeroPulgadas;


public void setNombre(String parametroNombre) {
	this.nombre = parametroNombre;
	
}
public String getNombre() {
	return this.nombre;
	
}
public void setCosto(int parametroCosto) {
	this.costo = parametroCosto;
	
}
public int getCosto() {
	return this.costo;
	
}
public void setNumeroPulgadas(double parametroNumeroPulgadas) {
	this.numeroPulgadas = parametroNumeroPulgadas;
	
}
public double getNumeroPulgadas() {
	return this.numeroPulgadas;
}
}
