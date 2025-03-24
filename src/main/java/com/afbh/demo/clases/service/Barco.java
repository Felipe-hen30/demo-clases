package com.afbh.demo.clases.service;

public class Barco {

	private String tipo;
	private int numeroHabitaciones;
	private double motor;
	
	
	public void setTipo(String parametroTipo) {
		this.tipo = parametroTipo;
		
	}
	public String getTipo() {
		return this.tipo;
		
	}
	public void setNumeroHabitaciones(int paramteroNumeroHabitaciones) {
		this.numeroHabitaciones = parametroNumeroHabitaciones;
		
		
	}
	public int getNumeroHabitaciones() {
		return this.numeroHabitaciones;
		
	}
	public void setMotor(double paramteroMotor) {
		this.motor = parametroMotor;
		
	}
	public double getMotor() {
		return this.motor;
		
	}
}
