package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase que representa a una noticia, tal noticia incluye titulo,fecha de
 * emision y un resumen
 * 
 * @author Josue Dario Alfaro
 * 
 */

/*
 * Estereotipo general @Component, para marcar la clase como un bean de spring y
 * se utilice como uno de sus objetos
 */
@Component
public class Noticia {

	/*
	 * --------Atributos--------
	 * 
	 */

	/**
	 * Atributo que representa la fecha de emision de la noticia
	 */
	private LocalDate fecha;

	/**
	 * Atributo que representa el titulo de la noticia
	 */
	private String titulo;

	/**
	 * Atributo que representa un resumen de lo acontecido en la noticia
	 */
	private String resumen;

	/*
	 * ---------Constructores---------
	 * 
	 */

	/**
	 * Constructor por defecto
	 */
	public Noticia() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor Parametrizado que recibe los siguientes datos como parametros
	 * 
	 * @param fecha   valor asignado a la variable miembro fecha
	 * @param titulo  valor asignado a la variable miembro titulo
	 * @param resumen valor asignado a la variable miembro resumen
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}

	/*
	 * -------Metodos Accesores------
	 * 
	 */

	/**
	 * Devuelve el valor que tiene asignado la variable miembro fecha
	 * 
	 * @return el valor de la variable fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * Asigna un valor a la variable miembro fecha
	 * 
	 * @param fecha con el valor para la variable miembro privada fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro titulo
	 * 
	 * @return el valor de la variable titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Asigna un valor a la variable miembro titulo
	 * 
	 * @param titulo con el valor para la variable miembro privada titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro resumen
	 * 
	 * @return el valor de la variable resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * Asigna un valor a la variable miembro resumen
	 * 
	 * @param resumen con el valor para la variable miembro privada resumen
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	/**
	 * Sobreescribe el metodo para mostrar la fecha de emision, el titulo de la
	 * noticia, y el resumen
	 */
	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}

}
