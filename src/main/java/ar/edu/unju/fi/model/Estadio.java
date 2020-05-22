package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Estadio {
	private String nombre;
	private LocalDate fechaFundacion;
	private String ciudad;
	private int capacidad;
	private String direccion;

	public Estadio() {
		// TODO Auto-generated constructor stub
	}

	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}

}
