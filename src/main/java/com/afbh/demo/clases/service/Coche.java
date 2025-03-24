package com.afbh.demo.clases.service;

public class Coche {

	private String marca;
	private int modelo;
	private double motor;
	
	public void setMarca(String parametroMarca) {
	 this.marca = parametroMarca;
	 
	}
	
	public String getMarca() {
		return this.marca;
		
	}
	public void setModelo(int parametroModelo) {
		this.modelo = parametroModelo;
		
	}
	public int getModelo() {
		return this.modelo;
		
	}
	public void setMotor(double paramteroMotor) {
		this.motor = parametroMotor;
		
	}
	public double getMotor() {
		return this.motor;
	}
	
}

