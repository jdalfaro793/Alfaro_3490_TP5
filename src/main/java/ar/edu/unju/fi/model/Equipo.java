package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que representa el equipo, con los atributos nombre del equipo y su
 * estadio correspondiente
 * 
 * @author Josue Dario Alfaro
 *
 */

/*
 * Estereotipo general @Component, para marcar la clase como un bean de spring y
 * se utilice como uno de sus objetos
 */
@Component
public class Equipo {

	/*
	 * --------Atributos--------
	 * 
	 */

	/**
	 * Atributo que representa el nombre del equipo
	 */
	private String nombre;

	/**
	 * Atributo que representa el estadio correspondiente del equipo
	 */

	/*
	 * Anotación @Autowired para aplicar la inyección de dependencia en el objeto
	 * socio.
	 */
	@Autowired
	private Estadio estadio;

	/*
	 * ---------Constructores---------
	 * 
	 */

	/**
	 * Constructor por defecto
	 */
	public Equipo() {
		// TODO Auto-generated constructor
	}

	/**
	 * Constructor parametrizado que recibe los siguientes datos como parametros
	 * 
	 * @param nombre  valor asignado a la variable miembro nombre
	 * @param estadio valor asignado a la variable miembro estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}

	/*
	 * -------Metodos Accesores------
	 * 
	 */

	/**
	 * Devuelve el valor que tiene asignado la variable miembro nombre
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
	 * Devuelve el valor que tiene asignado la variable miembro estadio
	 * 
	 * @return el valor de la variable estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * Asigna un valor a la variable miembro estadio
	 * 
	 * @param estadio con el valor para la variable miembro privada estadio
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	/**
	 * Sobreescribe el metodo para mostrar el nombre de equoi y su estadio
	 * correspondiente en una cadena de caracteres
	 * 
	 */
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}

}
