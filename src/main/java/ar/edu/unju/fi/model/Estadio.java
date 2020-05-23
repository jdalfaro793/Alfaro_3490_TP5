package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase que representa un objeto Estadio con sus atributos, nombre del estadio,
 * su fecha de fundacion, la ciudad donde reside, su capacidad y direccion
 * 
 * @author Josue Dario Alfaro
 *
 */

/*
 * Estereotipo general @Component, para marcar la clase como un bean de spring y
 * se utilice como uno de sus objetos
 */
@Component
public class Estadio {

	/*
	 * --------Atributos--------
	 * 
	 */

	/**
	 * Atributo que representa el nombre del estadio
	 */
	private String nombre;
	/**
	 * Atributo que representa la fecha de su fundacion
	 */
	private LocalDate fechaFundacion;
	/**
	 * Atributo que representa la ciudad donde reside
	 */
	private String ciudad;
	/**
	 * Atributo que representa la capacidad de personas que puede tener el estadio
	 */
	private int capacidad;
	/**
	 * Atributo que representa la direccion
	 */
	private String direccion;

	/*
	 * ---------Constructores---------
	 * 
	 */

	/**
	 * Constructor por defecto
	 */
	public Estadio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor Parametrizado que recibe los siguientes datos como parametros
	 * 
	 * @param nombre         valor asignado a la variable miembro nombre
	 * @param fechaFundacion valor asignado a la variable miembro fechaFundacion
	 * @param ciudad         valor asignado a la variable miembro ciudad
	 * @param capacidad      valor asignado a la variable miembro capacidad
	 * @param direccion      valor asignado a la variable miembro direccion
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}

	/*
	 * -------Metodos Accesores------
	 * 
	 */

	/**
	 * Devuelve el valor que tiene la variable miembro nombre
	 * 
	 * @return el valor de la variable nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor a la variable miembro nombre
	 * 
	 * @param nombre con el valor para la variable miembro privada nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el valor que tiene la variable miembro fechaFundacion
	 * 
	 * @return el valor de la variable fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * Asigna un valor a la variable miembro fechaFundacion
	 * 
	 * @param fechaFundacion con el valor para la variable miembro privada
	 *                       fechaFundacion
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * Devuelve el valor que tiene la variable miembro ciudad
	 * 
	 * @return el valor de la variable ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Asigna un valor a la variable miembro ciudad
	 * 
	 * @param ciudad con el valor para la variable miembro privada ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Devuelve el valor que tiene la variable miembro capacidad
	 * 
	 * @return el valor de la variable capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Asigna un valor a la variable miembro capacidad
	 * 
	 * @param capacidad con el valor para la variable miembro privada capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * Devuelve el valor que tiene la variable miembro direccion
	 * 
	 * @return el valor de la variable direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Asigna un valor a la variable miembro direccion
	 * 
	 * @param direccion con el valor para la variable miembro privada direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Sobreescribe los datos de clase estadio mostrando el nombre del estadio, la
	 * fecha de fundacion, su ciudad, capacidad y direccion
	 */
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}

}
